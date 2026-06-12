class Solution
{
    public boolean checkInclusion(String s1, String s2)
    {
        //Optimal Solution
        if (s1.length() > s2.length()) 
        {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        int windowSize = s1.length();

        // Build frequency for s1 and first window of s2
        for (int i = 0; i < windowSize; i++) 
        {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Count, s2Count)) 
        {
            return true;
        }

        // Slide the window over s2
        for (int i = windowSize; i < s2.length(); i++) 
        {
            // Add new right character
            s2Count[s2.charAt(i) - 'a']++;

            // Remove old left character
            s2Count[s2.charAt(i - windowSize) - 'a']--;

            if (Arrays.equals(s1Count, s2Count)) 
            {
                return true;
            }
        }
        return false;
    }
}
/**
time complexity : O(n)
space complexity : O(1)
 */


 /*Brute force
class Solution
{
    public boolean checkInclusion(String s1, String s2)
    {
        int len1 = s1.length();
        int len2 = s2.length();

        if(len1 > len2)
            return false;

        String sortedS1 = sort(s1);

        for(int i = 0; i <= len2-len1; i++)
        {
            String window = s2.substring(i, i+len1);

            if(sort(window).equals(sortedS1))
            {
                return true;
            }
        }
        return false;
    }
    private String sort(String str)
    {
        char[] t = str.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
 }
 /*
 N = length of s2, M = length of s1
 Time complexity : O((N-M+1).MlogM)
 Space complexity : O(M)
 */