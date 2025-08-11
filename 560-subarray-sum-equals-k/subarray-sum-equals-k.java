class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        // int n = nums.length;
        // int count =0;

        // for(int i = 0; i < n; i++)
        // {
        //     int currSum = 0;

        //     for(int j = i; j < n; j++)
        //     {
        //         currSum += nums[j];

        //         if(currSum == k)
        //             count ++;
        //     }
        // }
        // return count;

        //Using Map and prefix sum
        HashMap<Integer, Integer> prefixSum = new HashMap<>();

        int res =0;
        int currSum = 0;

        for(int i=0;i< nums.length; i++)
        {
            currSum += nums[i];

            if(currSum == k)
                res++;

            if(prefixSum.containsKey(currSum -k))
                res += prefixSum.get(currSum -k);

            prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0)+1); 
        }
        return res;
    }
}