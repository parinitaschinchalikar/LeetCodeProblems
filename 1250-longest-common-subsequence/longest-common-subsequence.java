class Solution 
{

    public int dfs(String word1, String word2, int index1, int index2, Integer[][] memo){
        if(index1 >= word1.length() || index2 >= word2.length())
            return 0;
        
        if(memo[index1][index2] != null)
            return memo[index1][index2];

        int result;
        if(word1.charAt(index1) == word2.charAt(index2)){
            result = 1+ dfs(word1, word2, index1+1, index2 +1, memo);
        } else{
            result = Math.max(
                dfs(word1, word2, index1+1, index2, memo),
                dfs(word1, word2, index1, index2+1, memo));
        }
        memo[index1][index2]=result;
        return result;
    }

    public int longestCommonSubsequence(String text1, String text2) 
    {
        return dfs(text1, text2, 0, 0, new Integer[text1.length()][text2.length()]);    
    }
}