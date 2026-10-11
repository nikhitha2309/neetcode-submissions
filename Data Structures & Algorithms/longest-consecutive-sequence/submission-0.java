class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }
        int lcs = 0;
        int clcs = 0;
        for(int num : nums){
            if(numSet.contains(num - 1)){
                continue;
            }
            clcs+=1;
            int temp = num;
            while(numSet.contains(temp+1)){
                temp++;
                clcs+=1;
            }
            if(clcs>lcs){
                lcs = clcs;
            }
            clcs = 0;

        }
        return lcs;
        
    }
}
