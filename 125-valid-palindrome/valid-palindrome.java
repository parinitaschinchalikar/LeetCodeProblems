class Solution 
{
    //Brute Force Algorithm
    // public boolean isPalindrome(String s) 
    // {
    //     String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    //     return isPalindromeHelper( str, 0);
    // }

    // private boolean isPalindromeHelper(String str, int i) 
    // {
    //     if (i >= str.length() / 2) 
    //     {
    //         return true;
    //     }

    //     if (str.charAt(i) != str.charAt(str.length() - i - 1)) 
    //     {
    //         return false;
    //     }

    //     return isPalindromeHelper(str, i + 1);
    // }

    //Optimal Solution 
    public boolean isPalindrome(String s)
    {
        int left=0, right=s.length()-1;

        while(left < right)
        {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
        left++;
        right--;
        }
        return true;
    }
}
//Time complexity : O(n)
//Space complexity : O(n)