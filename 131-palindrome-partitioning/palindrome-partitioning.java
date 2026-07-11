class Solution 
{
    public static boolean isPalindrome(String s){
        int l=0, r= s.length() -1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    public static void dfs(int startIndex, List<List<String>> answer, String s, ArrayList<String> path){
        if(startIndex == s.length()){
            List<String> li = new ArrayList<>(path);
            answer.add(li);
        }

        for(int next = startIndex; next< s.length(); next++){
            if(isPalindrome(s.substring(startIndex, next +1))){
                path.add(s.substring(startIndex, next+1));
                dfs(next+1, answer, s, path);
                path.remove(path.size() -1);
            }
        }
    }

    public List<List<String>> partition(String s) 
    {
        List<List<String>> answer = new ArrayList<>();
        dfs(0, answer, s, new ArrayList<String>() );
        return answer;        
    }
}