class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length ; i++) {
            int profit_temp = prices[i]-min;
            min = Math.min(min,prices[i]);
            profit = Math.max(profit,profit_temp);
            
        }
        return profit;
        
    }
}
