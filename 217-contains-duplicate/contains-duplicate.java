class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        //Brute Force
        /*
        for(int i=0; i< nums.length; i++)
        {
            for(int j=i+1; j< nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }
            }
        }
        return false;
        */

        //Optimal Solution
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            if(set.contains(num))
                return true;
            
            set.add(num);
        }
        return false;
    }
}