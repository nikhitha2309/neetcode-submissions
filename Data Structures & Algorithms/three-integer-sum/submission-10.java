class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();

        int i = 0;
        while(i< nums.length && nums[i] <= 0){
            if(i>0 && nums[i] == nums[i-1]){
                i++;
                continue;
            }
            int target = (-1)*nums[i];
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                if(nums[start] + nums[end] == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    resultList.add(list);
                    while (start < end &&

                           nums[start] == nums[start + 1]) {

                        start++;

                    }

                    // Skip duplicates on the right

                    while (start < end &&

                           nums[end] == nums[end - 1]) {

                        end--;

                    }

                    start++;

                    end--;
                    
                } else if (nums[start] + nums[end] <target) {
                    start++;

                }else{
                    end--;
                }
            }
            i++;

        }
        return resultList;
        
    }
}
