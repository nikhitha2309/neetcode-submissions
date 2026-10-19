class Solution {
    public int search(int[] nums, int target) {
        int pivot = getPivot(nums);
        int start = 0;
        int end = nums.length-1;
       if(pivot>0) {
           if (target >= nums[0]) {

               end = pivot-1;

           } else {
               start = pivot;
           }
       }
        while(start <= end){
            int mid = start +((end-start)/2);
            if(nums[mid] == target){
                return mid;
            }if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
        
    }
    public static int getPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + ((end-start)/2);
            if(nums[mid] > nums[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
