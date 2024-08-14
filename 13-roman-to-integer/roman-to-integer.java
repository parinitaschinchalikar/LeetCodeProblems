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
        int prevVal = 0;

        for(int i = s.length() -1; i >= 0; i-- )
        {
            int currentVal = d.get(s.charAt(i));

            if(currentVal < prevVal)
            {
                sum -= currentVal;
            }
            else
            {
                sum += currentVal;
            }

            prevVal = currentVal;
        }
        return sum;    
    }
}