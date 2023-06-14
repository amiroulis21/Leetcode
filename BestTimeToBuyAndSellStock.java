class Solution {
    public int maxProfit(int[] prices) {
    //prices contains integer values that each represent the price
    //of a stock at a given time. 
        int profit = 0;
        int min = prices[0];
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            else if(prices[i] > min && prices[i] - min > profit) {
                profit = prices[i] - min;

            }
        }
        return profit;
        
    }
}