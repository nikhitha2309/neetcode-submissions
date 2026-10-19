class Solution {
    public int findMin(int[] nums) {
        if(nums[0] <= nums[nums.length-1]){
            return nums[0];
        }

        int start = 0;
        int end = nums.length-1;
        while(start<= end){
            int mid = (start+end)/2;
            if(mid>0 &&nums[mid]< nums[mid-1] && mid < nums.length-1 && nums[mid] <nums[mid+1]){
                return nums[mid];
            }else if(mid == nums.length-1 && nums[mid] < nums[mid-1]){
                return nums[mid];
            }else if(mid == 0 && nums[mid] < nums[mid+1]){
                return nums[mid];

            }else if(nums[mid] > nums[end]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
        
    }
}
