class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int result =0;

        Set<Integer> store = new HashSet<>();

        for(int num : nums)
        {
            store.add(num);
        }

        for(int num: store)
        {
            if(!store.contains(num-1))
            {
                int length =1;
                while(store.contains(num + length))
                {
                    length++;
                }
                result = Math.max(result, length);
            }
        }
        return result;    
    }
}