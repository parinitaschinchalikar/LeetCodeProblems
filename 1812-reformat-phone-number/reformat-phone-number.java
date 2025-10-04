class Solution 
{
    public String reformatNumber(String number) 
    {
        StringBuilder res = new StringBuilder(number.length());
        int group = 0;

        for(int i=0; i< number.length(); i++ )
        {
            char c = number.charAt(i);
            if(c>='0' && c<='9')
            {
                res.append(c);
                if(++group == 3)
                {
                    res.append('-');
                    group =0;
                }
            }
        }

        int len = res.length();
        if(len > 0 && res.charAt(len - 1) == '-')
        {
            res.setLength(len -1);
            len--;
        }

        int lastGroupLen =0;
        for (int i = len - 1; i >= 0 && res.charAt(i) != '-'; i--) 
            lastGroupLen++;
        if (lastGroupLen == 1) 
        {
            int dash = res.lastIndexOf("-");
            char move = res.charAt(dash - 1);
            res.deleteCharAt(dash - 1);
            res.insert(dash, move);
        }

        return res.toString();
    }
}