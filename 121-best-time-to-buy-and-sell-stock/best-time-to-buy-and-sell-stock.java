// class Solution {
//     public int maxProfit(int[] prices) 
//     {
//         // 1st try
//         int buy = Integer.MAX_VALUE;
//         int profit = 0;

//         // for(int p = 0; p < prices.length; p++)
//         // {
//         //     if(prices[p] < buy)
//         //     {
//         //         buy = prices[p];
//         //     }

//         //     if(prices[p] - buy > profit)
//         //         profit = prices[p] - buy;
//         // }
        
//         for(int p : prices)
//         {
//             if(p < buy)
//             {
//                 buy = p;
//             }

//             if(p - buy > profit)
//             {
//                 profit = p - buy;
//             }
//         }

//         return profit;
//     }
// }

class Solution{
    public int maxProfit(int[] prices){
        int buy = Integer.MAX_VALUE;
        int profit =0;

        for(int p : prices){
            if(p < buy)  // 
                buy = p;
            
            if(p-buy > profit)   // calculate the max profit  
                profit = p-buy;
        }
        return profit;
    }
} 
//Time : O(N)
//Space : O(1)