class Solution {
    public int trap(int[] height) {
        int total = 0;
        int left = 0;
        int right = height.length-1;
        int R_Max = height[right];
        int L_Max = height[0];

        while(left<right){
            if(height[left] < height[right]){
                L_Max = Math.max(L_Max,height[left]);
                if(L_Max - height[left] >0){
                    total+=(L_Max - height[left]);
                }
                left++;
            }else if(height[left] >= height[right]){
                R_Max = Math.max(R_Max,height[right]);
                if(R_Max - height[right] >0){
                    total+=(R_Max - height[right]);
                }
                right--;
            }
        }
        return total;
        
    }
}
