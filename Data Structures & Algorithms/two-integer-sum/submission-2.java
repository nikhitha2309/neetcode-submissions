class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int reqVal = target-nums[i];
            if(hashMap.containsKey(reqVal)){
                return new int[] {hashMap.get(reqVal),i};
            }else{
                hashMap.put(nums[i],i);
            }

        }
        return new int[] {0,0};

        
    }
}
