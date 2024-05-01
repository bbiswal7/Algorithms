public class LRUCache {
     class ListNode{
        int key;
        int val;
        ListNode prev;
        ListNode next;
        public ListNode(int key, int val){
           this.key=key;
           this.val=val;
    }
     }

     ListNode head;
     ListNode tail;
     int capacity;
     Map<Integer,ListNode> hashMap;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new ListNode(-1,-1);
        tail=new ListNode(-1,-1);
        head.next=tail;
        tail.prev=head;
        hashMap=new HashMap<>();
    }
    
    public int get(int key) {
        ListNode node;
        if(hashMap.containsKey(key)){
            node=hashMap.get(key);
            remove(node);
            add(node);
        }else{
            return -1;
        }
        return node.val;
    }
    
    public void put(int key, int value) {
        if(hashMap.containsKey(key)){
            remove(hashMap.get(key));
        }
         ListNode node = new ListNode(key, value);
         hashMap.put(key, node);
         add(node);
         if(hashMap.size()>capacity){
            ListNode nodeToDelete = head.next;
            remove(head.next);
            hashMap.remove(nodeToDelete.key);

         }
        
    }

    public void add(ListNode node){

        ListNode prevnode=tail.prev;
        prevnode.next=node;
        node.prev=prevnode;
        node.next=tail;
        tail.prev=node;
    }

    public void remove(ListNode node){
        ListNode nextNode=node.next;
        ListNode prevNode=node.prev;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
