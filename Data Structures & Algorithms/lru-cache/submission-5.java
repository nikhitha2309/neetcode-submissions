class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key , int value){
            this.key = key;
            this.val = value;
        }
    }

    Node head;
    Node tail;
    HashMap<Integer,Node > cache;
    int size;
    LinkedList<Integer> lru ;

    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        size = capacity;
        lru = new LinkedList<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        
    }

    // Remove a node from its current position
    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Add a node immediately after head (MRU)
    private void addFirst(Node node){
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
           return -1;
       }

       Node node = cache.get(key);
       remove(node);
       addFirst(node);
       return node.val;
        
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.val = value;
            remove(node);
            addFirst(node);
        } else {
            if(cache.size() == size){
                Node lru = tail.prev;
                remove(lru);
                cache.remove(lru.key);
            }
            Node newNode = new Node(key,value);
            addFirst(newNode);
            cache.put(key,newNode);

            
        }

        
    }
}
