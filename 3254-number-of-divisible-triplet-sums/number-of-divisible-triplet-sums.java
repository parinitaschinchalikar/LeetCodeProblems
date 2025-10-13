class Solution 
{
    public int divisibleTripletCount(int[] nums, int d) 
    {
        int n = nums.length;

        if(n < 3)
            return 0;
        
        if(d == 1)
        {
            return n * (n - 1) * (n - 2) / 6;
        }

        int[] r = new int[n];

        for(int i =0; i<n; i++)
            r[i] = (int)(((long)nums[i]) % d);

        int count = 0;
        for(int i = 0; i < n-2; i++ )
        {
            for(int j =i+1; j < n-1; j++ )
            {
                for(int k = j+1; k < n; k++)
                {
                    if((r[i] + r[j] + r[k]) % d == 0)
                        count++;
                }
            }
        }
        return count; 
    }
}