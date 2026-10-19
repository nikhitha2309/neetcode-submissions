class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int required =0 ;
        for (int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            }else{
                map.put(t.charAt(i),1);
                required++;
            }

        }
        int formed = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;
        Map<Character,Integer> window = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);
            if(map.containsKey(ch) && map.get(ch).intValue() == window.get(ch).intValue()){
                formed ++;
            }
            while(formed == required){
                int length = right-left+1;
                if(length<minLength){
                    minLength = right-left+1;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar,window.getOrDefault(leftChar,0)-1);
                if(map.containsKey(leftChar) && window.get(leftChar) < map.get(leftChar) ){
                    formed--;
                }
                left++;
            }


        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLength);


    }
}
