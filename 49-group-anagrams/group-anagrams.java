class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        //Brute Force Algorithm
        /**
        if(strs.length == 0)
            return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
        */
        //N = number of Strings, K = maximum length of a string  
        //Time complexity : O(N*K*log K)
        //Space complexity : O(N*K)
        

        //Optimal Solution
        if(strs.length == 0)
            return new ArrayList<>();
        
        HashMap<String, List<String>> result = new HashMap<>();

        for(String s : strs)
        {
            int[] freq = new int[26];
            for(char c : s.toCharArray())
            {
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);
            result.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(result.values());
    }
}
//Time complexity : O(N*K) where N = length of strs, K = maximum length of a string in strs
//Space complexity : O(N*K)