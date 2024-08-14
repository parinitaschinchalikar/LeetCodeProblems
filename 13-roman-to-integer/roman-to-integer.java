class Solution {
    public int romanToInt(String s) 
    {
        Map<Character, Integer> d = new HashMap<>();
        d.put('I', 1);
        d.put('V', 5);
        d.put('X', 10);
        d.put('L', 50);
        d.put('C', 100);
        d.put('D', 500);
        d.put('M', 1000);

        int sum = 0; 

        for(int i = 0; i < s.length(); i++ )
        {
            int currentVal = d.get(s.charAt(i));

            if(i+1 < s.length() && currentVal < d.get(s.charAt(i+1)))
            {
                sum -= currentVal;
            }
            else
            {
                sum += currentVal;
            }
        }
        return sum;    
    }
}