class Solution 
{
    public List<Integer> largestDivisibleSubset(int[] nums) 
    {
        int n = nums.length;
        if(n == 0)
            return new ArrayList<>();

        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] prevIndex = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prevIndex, -1);

        int maxLength =1;
        int maxIndex =0;

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[j]+1 > dp[i]){
                    dp[i] = dp[j]+1;
                    prevIndex[i] = j;
                }
            }
            if(dp[i]> maxLength){
                maxLength = dp[i];
                maxIndex = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        int curr = maxIndex;
        while(curr != -1){
            result.add(nums[curr]);
            curr=prevIndex[curr];
        }
        Collections.reverse(result);
        return result;
    }
}