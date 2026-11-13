class Solution {
    public int[] plusOne(int[] digits) {
        int rem = 1;

        for(int i = digits.length-1; i>=0; i--){
            int sum = digits[i] + rem;
            if(sum>9){
                rem = 1;
                digits[i] = 0;
            }else{
                digits[i] = sum;
                return digits;
            }
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        for (int i = 0; i < digits.length; i++) {
            arr[i+1] = digits[i];
        }
        return arr;
        
    }
}
