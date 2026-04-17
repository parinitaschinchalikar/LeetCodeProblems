class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // //Brute force 
        // for(int i=0; i< nums.length; i++)
        // {
        //     for(int j=i+1; j< nums.length; j++)
        //     {
        //         if(nums[i]+ nums[j] == target)
        //             return new int[]{i,j};
        //     }
        // }
        // return new int[]{};

        //Optimal Solution
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++)
        {
            int cur = nums[i];
            // cur + x = target
            //x = target - cur
            int x = target -cur;
            if(map.containsKey(x))
            {
                return new int[] {map.get(x), i};
            }
            map.put(cur, i);
        }
        return null;
    }
}
//Time : O(n)
//Space : O(n)