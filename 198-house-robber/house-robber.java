class Solution 
{
    public int rob(int[] nums) 
    {
        if(nums == null || nums.length ==0)
            return 0;
        
        if(nums.length == 1)
            return nums[0];

        int rob1 = 0, rob2 = 0;
        for (int num : nums) {
            int newRob = Math.max(rob1 + num, rob2);
            rob1 = rob2;
            rob2 = newRob;
        }
        return rob2;
        
        // int evenSum = 0;
        // int oddSum = 0;
        // for(int i=1;i<nums.length;i++)
        // {
        //     if(i%nums.length == 0)
        //     {
        //         evenSum = evenSum + nums[i];  
        //     }
        //     else
        //     {
        //         oddSum = oddSum + nums[i];
        //     }
        // }
        // if(evenSum > oddSum)
        //     return evenSum;
        // else
        //     return oddSum;
    }
}