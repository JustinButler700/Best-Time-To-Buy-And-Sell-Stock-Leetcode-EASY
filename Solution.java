class Solution {
    public int maxProfit(int[] prices) {
        int maxSell = 0;
        int maxProfit = 0;
        //First we find the max element to the right of each by backtracking
        for(int i = prices.length-1; i >= 0; i--)
        {
            // Max Profit keeps track of the maximum return we could get by buying at curr price
            maxProfit = maxProfit > maxSell-prices[i] ? maxProfit : maxSell-prices[i];
            //Max sell, keeps track of the maximum selling price to the right of each element
            maxSell = maxSell > prices[i] ? maxSell : prices[i];
        }
        return maxProfit;
    }
}
