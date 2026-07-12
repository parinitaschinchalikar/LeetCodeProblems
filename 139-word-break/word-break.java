class Solution 
{
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        Map<Integer, Boolean> memo = new HashMap<>();
        return dfs(0, s, wordDict, memo);        
    }

    public boolean dfs(int startIndex, String s, List<String> words, Map<Integer, Boolean> memo){
        if(startIndex == s.length())
            return true;
        
        if(memo.containsKey(startIndex))
            return memo.get(startIndex);

        boolean ans = false;
        for(String word : words){
            if(s.startsWith(word, startIndex)){
                if(dfs(startIndex + word.length(), s, words, memo)){
                    ans = true;
                    break;
                }
            }
        }
        memo.put(startIndex, ans);
        return ans;
    }
}