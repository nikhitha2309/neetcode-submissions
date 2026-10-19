class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int pile : piles){
            if(pile>end){
                end = pile;
            }
        }
        int min = Integer.MAX_VALUE;
        while(start<= end){
            int mid = (start+end)/2;
            int hrs = getHours(piles,mid);

            if(hrs<= h && min > mid ){
                min = mid;
                end = mid-1;

            }else{
                start = mid+1;
            }


        }
        return min;
        
    }
    public static int getHours(int[] piles , int speed){
        int hrs = 0;
        for(int pile : piles){
            hrs +=(pile/speed);
            int rem = pile % speed;
            if(rem >0){
                hrs +=1;
            }
        }
        return hrs;
    }

}
