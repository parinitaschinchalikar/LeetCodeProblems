class Solution {
    public int maxProfit(int[] prices) 
    {
        // int buy = prices[0];
        // int profit = 0;

        // for(int i = 1; i< prices.length; i++ )
        // {
        //     if(prices[i] < buy)
        //     {
        //         buy = prices[i];
        //     }
        //     else if(prices[i] - buy > profit)
        //     {
        //         profit = prices[i] - buy;
        //     }
        // }
        // return profit;

        //Dynamic Programming

        int profit = 0;
        int buy = prices[0];
        for(int sell : prices)
        {
            profit = Math.max(profit, sell-buy);
            buy = Math.min(buy, sell);
        }
        return profit;
    }
}
