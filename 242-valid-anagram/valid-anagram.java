// class Solution {
//     public boolean isAnagram(String s, String t) 
//     {
//         // Optimal
//         if(s.length() != t.length())
//         {
//             return false;
//         } 

//         int[] count = new int[26];

//         for(int i = 0; i < s.length(); i++)
//         {
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }

//         for(int c : count)
//         {
//             if(c != 0)
//             {
//                 return false;
//             }
//         }

//         return true;


//         // // Brute Force
//         // if(s.length() != t.length())
//         // {
//         //     return false;
//         // }

//         // char[] s1 = s.toCharArray();
//         // char[] t1 = t.toCharArray();

//         // Arrays.sort(s1);
//         // Arrays.sort(t1);

//         // return Arrays.equals(s1, t1);
//     }
// }

class Solution{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;

        int[] count = new int[26];

        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i)- 'a']++;
            count[t.charAt(i)- 'a']--;
        }

        for(int c : count){
            if(c!=0)
                return false;
        }
        return true;
    }
}
//Time : O(N)
//Complexity : O(1)