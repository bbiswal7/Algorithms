public class CourseSchedule {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> adjList=new HashMap<>();

        for(int i=0;i<numCourses;i++){
            adjList.put(i, new ArrayList<Integer>());
        }

        int[] indegree=new int[numCourses];

        for(int[] preReq: prerequisites){
            indegree[preReq[0]]++;     
            adjList.get(preReq[1]).add(preReq[0]);
        }

        Queue<Integer> queue=new LinkedList<>();

        int zeroIndegreeElementsCount=0;

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        int[] order=new int[numCourses];
        int idx=0;
        while(!queue.isEmpty()){
            int polledElement=queue.poll();
            order[idx]=polledElement;
            idx++;
            zeroIndegreeElementsCount++;
            for(int neighbor: adjList.get(polledElement)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0){
                    queue.add(neighbor);
                }
            }
        }
        if(zeroIndegreeElementsCount!=numCourses){
            return new int[]{};
        }
        return order;
    }
}
