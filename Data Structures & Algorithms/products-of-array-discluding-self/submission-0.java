class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nzeroes = 0;
        int product = 1;

        for(int num : nums){
            if(num != 0){
                product *= num;
            }else{
                nzeroes +=1;
            }
        }

        if(nzeroes >1){
            Arrays.fill(nums,0);

        }else{
            for (int i = 0; i < nums.length; i++) {
                if(nzeroes == 1 && nums[i] != 0){
                    nums[i] = 0;

                } else if (nzeroes == 1 && nums[i] == 0) {
                    nums[i] = product;

                }else{
                    nums[i] = product/nums[i];
                }
            }
        }

        return nums;
        
    }
}  
