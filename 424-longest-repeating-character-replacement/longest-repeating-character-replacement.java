/**
public class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        //Brute Force - Sliding window
        int n = s.length();
        int result =0;
        for(int i =0; i<n; i++)
        {
            int[] count = new int[26];
            for(int j=i; j<n; j++)
            {
                count[s.charAt(j) - 'A']++;

                int maxFreq = 0;
                for(int c=0; c<26; c++)
                {
                    maxFreq = Math.max(maxFreq, count[c]);
                }
                int windowLength = j-i+1;
                int replacementsNeeded = windowLength - maxFreq;

                if(replacementsNeeded <= k)
                    result = Math.max(result, windowLength);
            }
        }
        return result;                
    }
}

time : O(n^2)
space : O(1)
*/

public class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        //Optimal Solution - Sliding window + Hashmap
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;

        int l = 0, maxf = 0;
        for (int r = 0; r < s.length(); r++) 
        {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxf = Math.max(maxf, count.get(s.charAt(r)));

            while ((r - l + 1) - maxf > k) 
            {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
/**
time : O(n)
space : O(1)
*/