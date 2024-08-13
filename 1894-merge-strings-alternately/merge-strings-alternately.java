class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder mergedString = new StringBuilder();
        int i=0,j=0;

        while(i<word1.length() && j < word2.length())
        {
            mergedString.append(word1.charAt(i));
            mergedString.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i < word1.length())
        {
            mergedString.append(word1.charAt(i++));
        }

        while(j < word2.length())
        {
            mergedString.append(word2.charAt(j++));
        }

        return mergedString.toString();
    }
}