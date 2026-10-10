class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int diff = 0;
        int flag = 0;
        for(int number: nums){
            diff = target - number;
            
            if(map.containsKey(diff)){
                int[] a = {map.get(diff),flag};
                return a;
            }else{
                map.put(number,flag);
            }
            flag+=1;
        }
    return null;
        
    }
}
