// class Solution 
// {
//     public int maxArea(int[] height) 
//     {
//         //Brute force
//         int maxWater =0;

//         for(int i=0; i < height.length; i++)
//         {
//             for(int j=i+1; j < height.length; j++)
//             {
//                 int width = j-i;
//                 int containerHeight = Math.min(height[i], height[j]);
//                 int area = width * containerHeight;
//                 maxWater = Math.max(maxWater, area);
//             }
//         }
//         return maxWater;
//     }
// }
//time complexity : O(n^2)
//space complexity : O(1)

class Solution 
{
    public int maxArea(int[] height)
    {
        //Optimal Solution
        int left =0, right = height.length-1, result =0;

        while(left < right)
        {
            int container = (right - left) * Math.min(height[left], height[right]);

            result = Math.max(container, result);
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return result;
    }
}
//Time complexity : O(n)
//Space complexity : O(1)