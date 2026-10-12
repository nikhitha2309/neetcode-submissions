class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultList = new HashSet<>();

        for (int i = 0; i < nums.length-2 ; i++) {
            int target = (-1)*nums[i];
            Set<Integer> numMap = new HashSet<>();

            for (int j = i+1; j < nums.length ; j++) {
                int rem = target - nums[j];
                if(numMap.contains(rem)){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(rem);
                    list.add(nums[j]);
                    Collections.sort(list);
                   resultList.add(list);

                }else{
                    numMap.add(nums[j]);
                }



            }


        }
        return resultList.stream().toList();
        
    }
}
