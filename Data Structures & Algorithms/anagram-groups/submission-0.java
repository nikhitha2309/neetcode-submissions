class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anaMap = new HashMap<>();

        for(String str : strs){
            int[] countArr = new int[26];
            for (int i = 0; i < str.length(); i++) {
                countArr[str.charAt(i) - 'a'] +=1;

            }
            if(anaMap.containsKey(Arrays.toString(countArr))){
                List<String> presentList = anaMap.get(Arrays.toString(countArr));
                presentList.add(str);
                anaMap.put(Arrays.toString(countArr),presentList);
            }else{
                anaMap.put(Arrays.toString(countArr),new ArrayList<>(List.of(str)));
            }
        }
        return anaMap.values().stream().toList();
        
    }
}
