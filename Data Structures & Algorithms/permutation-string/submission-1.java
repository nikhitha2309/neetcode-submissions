class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr= new int[26];
        int left = 0;
        int right = 0;
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i)-'a'] +=1;

        }
        while(left<s2.length() && right < s2.length()){
            if(arr[s2.charAt(left)-'a'] > 0){
                right = left+s1.length()-1;
                if(right> s2.length()-1){
                    continue;
                }
                int[] arr_temp= new int[26];
                for (int i = left; i <= right ; i++) {
                    arr_temp[s2.charAt(i)-'a'] +=1;
                }
                if(Arrays.toString(arr_temp).equals(Arrays.toString(arr))){
                    return true;
                }

            }
            left++;
        }
        return false;
        
    }
}
