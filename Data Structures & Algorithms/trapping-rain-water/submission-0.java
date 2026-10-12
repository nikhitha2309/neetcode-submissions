class Solution {
    public int trap(int[] height) {
        int[] prefix_Max = new int[height.length];
        int[] suffix_Max = new int[height.length];

        for (int i = 0; i < height.length; i++) {
            if(i==0){
                prefix_Max[0] = 0;
            }else{
                prefix_Max[i] = Math.max(prefix_Max[i-1] , height[i-1]);
            }

        }
        for (int i = height.length-1; i > 0 ; i--) {
            if(i == height.length-1){
                suffix_Max[i] = 0;
            }else{
                suffix_Max[i] = Math.max(suffix_Max[i+1] , height[i+1]);
            }

        }
        int count = 0;
        for (int i = 0; i < height.length; i++) {
            int h = Math.min(prefix_Max[i] , suffix_Max[i])-height[i];
            if(h>0){
                count+=h;
            }

        }
        return count;
        
    }
}
