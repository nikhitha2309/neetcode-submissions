class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1){

            int num = n;
            int sum  =0 ;
            while(num != 0){
                int squareVal = num % 10;
                sum = sum + (squareVal * squareVal);
                num = num / 10;
            }
            if(set.contains(sum)){
                return false;
            }else{
                n = sum;
                set.add(sum);
            }

        }
        return true;
        
    }
}
