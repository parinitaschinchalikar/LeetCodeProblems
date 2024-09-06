class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int original = x;
        int reversed =0;

        if(x < 0)
            return false;

        while(x !=0)
        {
            int lastdigit = x % 10;
            reversed = reversed * 10 + lastdigit;
            x /=10;
        }          
         return original == reversed; 
    }
}