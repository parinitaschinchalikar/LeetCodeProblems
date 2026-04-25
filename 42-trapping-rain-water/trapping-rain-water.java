// class Solution
// {
//     public int trap(int[] height) 
//     {
//         //Brute Force 
//         if(height == null || height.length == 0)
//         {
//             return 0;
//         }
        
//         int n = height.length;
//         int water =0;

//         for(int i=0; i<n; i++)
//         {
//             int leftMax = height[i];
//             int rightMax = height[i];

//             for(int l=0; l<i; l++)
//             {
//                 leftMax = Math.max(leftMax, height[l]);
//             }
//             for(int r=i; r<n; r++)
//             {
//                 rightMax = Math.max(rightMax, height[r]);
//             }
//             water += Math.min(leftMax, rightMax) - height[i];
//         }
//         return water;
//     }
// }
//Time complexity : O(n)
//Space complexity : O(1)


class Solution 
{
    public int trap(int[] height)
    {
        //Optimal Solution
        if( height == null || height.length == 0 )
        {
            return 0;
        }

        int l = 0, r = height.length-1, res=0;
        int leftMax = height[l], rightMax = height[r];
        
        while( l < r )
        {
            if(leftMax < rightMax)
            {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            }
            else
            {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}
//Time complexity : O(n)
//Space complexity : O(1)