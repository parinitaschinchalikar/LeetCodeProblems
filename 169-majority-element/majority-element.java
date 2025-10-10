/**
class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int max = nums.length/2;

        for (int num : nums)
        {
            int count = 0;
            for(int element : nums)
            {
                if(element == num)
                {
                    count ++;
                }
            }
            if(count > max)
            {
                return num;
            }
        }
        return -1;
    }
}
*/

 
//Using HashMap
class Solution 
{
    private Map<Integer, Integer> countNums(int[] nums)
    {
        Map<Integer, Integer> counts =  new HashMap<Integer, Integer>();
        for(int num : nums)
        {
            if(!counts.containsKey(num))
            {
                counts.put(num,1);
            }
            else
            {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums)
    {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;

        for(Map.Entry<Integer, Integer> entry : counts.entrySet())
        {
            if(entry.getValue() > nums.length /2)
                return entry.getKey();
        }
        return majorityEntry.getKey();
    }
}