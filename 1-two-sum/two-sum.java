//Brute Force
// class Solution{
//     public int[] twoSum(int[]nums, int target){
//         for(int i=0; i< nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] + nums[j] == target)
//                     return new int[]{i, j};
//             }
//         }
//         return new int[]{0};
//     }
// }
//Time : O(n^2)
//Space : O(1)

//Optimal Solution - Using HashMap
class Solution{
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        // loop to check if complement exists 
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement))
                return new int[]{map.get(complement), i};
            
            map.put(nums[i], i);
        } 
        return new int[] {};
    }
}
//Time : O(n)
//Space : O(n)