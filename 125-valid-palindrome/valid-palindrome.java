class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeHelper( str, 0);
    }

    private boolean isPalindromeHelper(String str, int i) 
    {
        if (i >= str.length() / 2) 
        {
            return true;
        }

        if (str.charAt(i) != str.charAt(str.length() - i - 1)) 
        {
            return false;
        }

        return isPalindromeHelper(str, i + 1);
    }
}