class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0] , diff = Math.abs(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(Math.abs(nums[i]) < diff){
                ans = nums[i];
                diff = Math.abs(nums[i]);
            }
            if(diff == Math.abs(nums[i]) && nums[i] > ans){
                ans = nums[i];
            }
        }
        return ans;


        // int min = nums[0];
        // for(int n : nums)
        // {
        //     int distance = Math.abs(n);
        //     if(distance < Math.abs(min))
        //     {
        //         min = distance;
        //     } 
        // }
        // return min;
    }
}