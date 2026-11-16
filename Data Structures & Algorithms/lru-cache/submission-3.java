class LRUCache {
    HashMap<Integer, Integer> cache;
    int size;
    LinkedList<Integer> lru ;

    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        size = capacity;
        lru = new LinkedList<>();
        
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        
            lru.remove(Integer.valueOf(key));
            lru.addFirst(key);

        
        return cache.get(key);
        
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.put(key,value);
            lru.remove(Integer.valueOf(key));
            lru.addFirst(key);
        } else {
            if(cache.size() == size){
                cache.remove(Integer.valueOf(lru.removeLast()));
                
            }

            cache.put(key,value);
            lru.addFirst(key);

            
        }

        
    }
}
