class Solution {
    public int numDecodings(String s) {
        int[] memo = new int[s.length() +1];
        Arrays.fill(memo, -1);
        return dfs(0, s, memo);
    }

    private int dfs(int startIndex, String s, int[] memo){
        if(memo[startIndex] != -1)
            return memo[startIndex];
        
        if(startIndex == s.length())
            return 1;
        
        int ways =0;
        if(s.charAt(startIndex) == '0')
            return ways;
        
        ways += dfs(startIndex +1, s, memo);
        if(startIndex +2 <= s.length() && Integer.parseInt(s.substring(startIndex, startIndex + 2)) <= 26){
            ways += dfs(startIndex +2, s, memo);
        }
        memo[startIndex] = ways;
        return ways;
    }
}