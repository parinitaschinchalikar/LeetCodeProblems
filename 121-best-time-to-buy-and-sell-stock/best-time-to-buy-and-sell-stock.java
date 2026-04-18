class Solution {
    public int maxProfit(int[] prices) 
    {
        //Greedy One pass solution
        // int buy = Integer.MAX_VALUE;
        // int profit = 0;

        // for(int i=0; i< prices.length; i++)
        // {
        //     if(prices[i] < buy)
        //     {
        //         buy = prices[i];
        //     }
        //     else if(prices[i]-buy > profit)
        //     {
        //         profit = prices[i] - buy;
        //     }
        // }

        //Dynamic Programming
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) 
        {
            buy = Math.min(buy, price);
            profit = Math.max(profit, price - buy);
        }
        return profit;
    }
}