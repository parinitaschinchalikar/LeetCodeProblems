class Solution 
{
    public int rob(int[] nums) 
    {
        if(nums == null || nums.length ==0)
            return 0;
        
        if(nums.length == 1)
            return nums[0];

        int sum1 = 0, sum2 = 0;
        for (int num : nums) {
            int newSum = Math.max(sum1 + num, sum2);
            sum1 = sum2;
            sum2 = newSum;
        }
        return sum2;
    }
}