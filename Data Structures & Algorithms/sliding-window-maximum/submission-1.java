class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        TreeMap<Integer,Integer> hashMap = new TreeMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            hashMap.put(nums[i] , hashMap.getOrDefault(nums[i],0)+1);
            if(nums[i] > max){
                max = nums[i];
            }

        }
        res[0] = max;


        for (int i = k; i < nums.length ; i++) {
            hashMap.put(nums[i-k] , hashMap.getOrDefault(nums[i-k],0) -1) ;
            if(hashMap.get(nums[i-k]) == 0){
                hashMap.remove(nums[i-k]);
            }
            hashMap.put(nums[i] , hashMap.getOrDefault(nums[i],0)+1);
            res[i-k+1] = hashMap.lastKey();


        }


        return res;
        
    }
}
