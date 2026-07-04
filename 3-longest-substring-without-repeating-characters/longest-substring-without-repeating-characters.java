class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        //Brute Force
        // int maxLen = 0;
        // for(int i=0; i<s.length();i++)
        // {
        //     Set<Character> set = new HashSet<>();

        //     for(int j=i; j<s.length(); j++)
        //     {
        //         char ch = s.charAt(j);

        //         if(set.contains(ch))
        //             break;

        //         set.add(ch);
        //         maxLen = Math.max(maxLen, j-i+1);
        //     }
        // }
        // return maxLen;

        //Optimal Solution
        HashSet<Character> set = new HashSet<>();
        int l=0, res=0;

        for(int r=0; r<s.length(); r++)
        {
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
/**
time : O(n)
space : O(min(n, charset))
 */