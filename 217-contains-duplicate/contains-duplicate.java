// class Solution {
//     public boolean containsDuplicate(int[] nums) 
//     {
//         // Optimal solution
//         HashSet<Integer> set = new HashSet<>();

//         for(int i = 0; i < nums.length; i++)
//         {
//             if(set.contains(nums[i]))
//             {
//                 return true;
//             }
//             set.add(nums[i]);
//         }

//         return false;


//         // // Brute Force
//         // for(int i = 0; i < nums.length; i++)
//         // {
//         //     for(int j = i + 1; j < nums.length; j++)
//         //     {
//         //         if(nums[i] == nums[j])
//         //         {
//         //             return true;
//         //         }
//         //     }
//         // } 

//         // return false;
//     }
// }

// class Solution{
//     public boolean containsDuplicate(int[] nums){
//         for(int i=0; i< nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] == nums[j])
//                     return true;
//             }
//         }
//         return false;
//     }
// }
//Time : O(n^2)
//Space : O(1)

class Solution{
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
//Time : O(N)
//Space : O(N)