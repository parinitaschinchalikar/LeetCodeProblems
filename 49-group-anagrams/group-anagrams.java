class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        //Brute Force Algorithm
        // Map<String, List<String>> map = new HashMap<>();

        // for(String s: strs)
        // {
        //     char[] c = s.toCharArray();
        //     Arrays.sort(c);
        //     String key = new String (c);

        //     map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        // }     
        // return new ArrayList<>(map.values());

        //Optimal Solution 
        HashMap<String, List<String>> result = new HashMap<>();

        for(String s : strs)
        {
            int[] count = new int[26];
            for(char c : s.toCharArray())
            {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(s);
        }
        return new ArrayList<>(result.values());
    }
}