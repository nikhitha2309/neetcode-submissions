class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int nRepetitions = 0;
        int prevValue = 0;
        for(int i =0 ; i <nums.length ; i++){
            if(i==0){
                prevValue = nums[i];
                nRepetitions = 1;
            }else{
                if(prevValue != nums[i]){
                    if(nRepetitions <2){
                        return prevValue;
                    }else{
                        nRepetitions = 1;
                        prevValue = nums[i];
                    }

                }else{
                    nRepetitions+=1;
                }
            }

        }
        return prevValue;
    }
}
