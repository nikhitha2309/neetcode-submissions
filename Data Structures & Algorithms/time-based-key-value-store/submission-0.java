class TimeMap {
    private Map<String , TreeMap<Integer,String>> timeMap;

    

    public TimeMap() {
        timeMap = new HashMap<>();

        
    }
    
    public void set(String key, String value, int timestamp) {
        if(timeMap.containsKey(key)){
            TreeMap<Integer,String> map = timeMap.get(key);
            map.put(timestamp,value);
            timeMap.put(key,map);
        }else{
            TreeMap<Integer,String> map = new TreeMap<>();
            map.put(timestamp,value);
            timeMap.put(key,map);
        }
        
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> treeMap = timeMap.get(key);
        if(treeMap == null){
            return "";
        }
        Map.Entry<Integer,String> entry = treeMap.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
        
    }
}
