class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
       int end = numbers.length-1;
       while(start < end){
           int diff = target-numbers[start];
           while(numbers[end] > diff){
               end--;
           }
           if(numbers[end] == diff){
               return new int[] {start+1,end+1};
           }
           start++;
       }
       return new int[] {-1,-1};
        
    }
}
