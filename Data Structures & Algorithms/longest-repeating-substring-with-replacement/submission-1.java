class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int maxOcc = 0;
        while(left<=right && right< s.length()){
            arr[s.charAt(right) - 'A'] +=1;
            maxOcc = Math.max(arr[s.charAt(right) - 'A'],maxOcc);
            int len = right-left+1-maxOcc;
            if(len<=k){
                maxLength = Math.max(maxLength,right-left+1);
                
            }else{
                arr[s.charAt(left)-'A'] -= 1;
                int max = 0;
                for (int num : arr) {
                    if(num>max){
                        max = num;
                    }

                }
                maxOcc = max;
                left++;
            }
            right++;




        }
        return maxLength;
        
    }
}
