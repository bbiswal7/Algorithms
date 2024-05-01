public class BipartiteGraph {
    public boolean isBipartite(int[][] graph) {
        int[] visited=new int[graph.length];
        Arrays.fill(visited,-1);

        for(int i=0;i<graph.length;i++){
            if(visited[i]==-1 && !dfs(graph, visited,i,0)){
                return false;
            }
        }
        return true;
        
    }

    public boolean dfs(int[][] graph, int[] visited, int node, int level){

        if(visited[node]!=-1){
            if(visited[node]!=level%2){
                return false;
            }
            return true;
        }

        visited[node]=level%2;
        for(int neighbor: graph[node]){
            boolean result=dfs(graph, visited, neighbor, level+1);
            if(!result){
                return false;
            }
        }

        return true;

    }
}
