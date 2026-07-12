class Solution 
{
    public int minCostClimbingStairs(int[] cost) 
    {
        int[] minCost = new int[cost.length +1];

        for(int i=2; i<minCost.length; i++){
            int takeOneStep = minCost[i-1] + cost[i-1];
            int takeTwoSteps = minCost[i-2] + cost[i-2];
            minCost[i] = Math.min(takeOneStep, takeTwoSteps);
        }
        return minCost[minCost.length -1];
    }
}