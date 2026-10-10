class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> anaMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(anaMap.containsKey(s.charAt(i))){
                anaMap.put(s.charAt(i) , anaMap.get(s.charAt(i))+1);
            }else{
                anaMap.put(s.charAt(i),1);
            }

        }

        for (int i = 0; i < t.length(); i++) {
            if(anaMap.containsKey(t.charAt(i)) && anaMap.get(t.charAt(i))>0){
                anaMap.put(t.charAt(i) , anaMap.get(t.charAt(i))-1);

            }else{
                return false;
            }

        }

        for (int num : anaMap.values()){
            if(num>0){
                return false;
            }
        }
        return true;


    }
}
