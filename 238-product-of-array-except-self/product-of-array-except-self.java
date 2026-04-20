class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        //Brute Force algorithm
        /**int n = nums.length;
        int [] answer = new int [n];

        for(int i=0; i<n; i++)
        {
            int product = 1;

            for(int j=0; j<n; j++)
            {
                if(i!=j)
                {
                    product *= nums[j];
                }
            }
            answer[i] = product;
        }
        return answer;
        */

//Time complexity : O(n^2)
//Space complexity : O(n)

        //Optimal Solution - Prefix + Suffix
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = 1;

        for(int i=1; i<n; i++)
        {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        int suffixProduct =1;
        for(int i=n-1; i>=0; i--)
        {
            prefix[i] = prefix[i] * suffixProduct;
            suffixProduct *= nums[i];
        }
        return prefix;
    }
}
//Time complexity : O(n)
//Space complexity : O(n)