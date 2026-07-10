class Solution 
{
    private static final Map<Character, char[]> KEYBOARD = Map.of(
        '2',"abc".toCharArray(),
        '3',"def".toCharArray(),
        '4',"ghi".toCharArray(),
        '5',"jkl".toCharArray(),
        '6',"mno".toCharArray(),
        '7',"pqrs".toCharArray(),
        '8',"tuv".toCharArray(),
        '9',"wxyz".toCharArray());

    private static void dfs(int startIndex, StringBuilder path, List<String> result, String digits){
        if(startIndex == digits.length()){
            result.add(path.toString());
            return;
        }
        char nextDigit = digits.charAt(startIndex);
        for(char letter : KEYBOARD.get(nextDigit)){
            path.append(letter);
            dfs(startIndex+1, path, result, digits);
            path.deleteCharAt(path.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) 
    {
        List<String> result = new ArrayList<>();
        dfs(0, new StringBuilder(), result, digits);
        return result;    
    }
}