class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[256];
        Arrays.fill(arr,0);

        int start = 0;
        int end = 0;
        int maxLength = 0;
        while(start<s.length() && end<s.length()){
            if(arr[s.charAt(end)] !=0){
                maxLength = Math.max(maxLength,end-start);
                while(s.charAt(start) != s.charAt(end)){
                    arr[s.charAt(start)] -= 1;
                    start++;

                }
                start++;

            }else{
                arr[s.charAt(end)] = 1;
            }
            end++;

        }
        maxLength = Math.max(maxLength,end-start);
        return maxLength;
        
    }
}
