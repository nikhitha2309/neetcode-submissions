class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        prefix[0] = 1;
        postfix[postfix.length-1] = 1;

        //to fill prefix Array
        for (int i = 1; i < nums.length ; i++) {
            prefix[i] = prefix[i-1]*nums[i-1];

        }

        // to fill postfixArray;
        int post = 1;
        for (int i = nums.length-1; i>=0  ; i--) {
            prefix[i] = prefix[i] * post;
            post *= nums[i];

        }

       return prefix;
        
    }
}  
