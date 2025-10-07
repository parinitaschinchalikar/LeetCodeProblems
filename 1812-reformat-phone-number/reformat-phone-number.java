class Solution 
{
    public String reformatNumber(String number) 
    {
        // collect digits and remove hyphens
        StringBuilder digits = new StringBuilder(number.length());
    
        for (int i = 0; i < number.length(); i++) 
        {
            char c = number.charAt(i);
            if (c >= '0' && c <= '9') 
                digits.append(c);
        }

        int n = digits.length(), i = 0;
        StringBuilder out = new StringBuilder(n);

        while (n - i > 4)
        {
            out.append(digits, i, i + 3).append('-');
            i += 3;
        }

        int remain = n - i;

        if (remain == 4) 
        {
            out.append(digits, i, i + 2).append('-').append(digits, i + 2, i + 4);
        } 
        else 
        { // 2 or 3
            out.append(digits, i, n);
        }
        return out.toString();
    }
}

/**Brute Force Solution:

class Solution 
{
    public String reformatNumber(String number) 
    { 
        String digits = number.replaceAll("\\D", ""); 
        int n = digits.length(); 
        StringBuilder res = new StringBuilder(); 
        int i = 0; 
        
        while(n > 4) 
        { 
            res.append(digits.substring(i, i+3)).append("-"); 
            i += 3; 
            n -= 3; 
        } 
        if(n == 4) 
        { 
            res.append(digits.substring(i, i+2)).append("-").append(digits.substring(i+2)); 
        } 
        else 
        { 
            res.append(digits.substring(i)); 
        } 
        return res.toString(); 
    } 
}
*/