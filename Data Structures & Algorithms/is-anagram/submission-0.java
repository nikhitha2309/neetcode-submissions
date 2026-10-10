class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch = s.toCharArray(); 
        char[] ch2 = t.toCharArray();
        for(char c : ch ){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        for(char c : ch2){
            if(map.containsKey(c)){
                int diff = map.get(c)-1;
                if(diff>0){
                    map.put(c,diff);
                }else{ 
                    if(diff == 0){
                        map.remove(c);
                    }
                    else{
                        return false;
                    }
                }

            }else{
                return false;
            }
        }
        if(map.size()>0){
            return false;
        }else{
            return true;
        }


    }
}
