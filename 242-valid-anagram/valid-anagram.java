class Solution {
    public boolean isAnagram(String s, String t){
        /**Brute Force - Sorting
        if(s.length() != t.length()){
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
/**
Time complexity: O(nlogn) 
Space complexity:O(1)
*/
        //Optimal 
        if(s.length() !=t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i=0; i< s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int value : count){
            if(value != 0)
                return false;
        }
        return true;
    }
}
/**
Time complexity : O(n)
Space complexity : O(1)
*/