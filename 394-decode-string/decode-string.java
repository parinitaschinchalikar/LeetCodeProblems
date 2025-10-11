// class Solution 
// {
//     public String decodeString(String s) 
//     {
//         while(true)
//         {
//             int left = s.lastIndexOf("[");
//             if(left == -1)
//                 break;
            
//             int right = s.indexOf("]", left);

//             int kStart = left -1;
//             while(kStart >= 0 && Character.isDigit(s.charAt(kStart)))
//             {
//                 kStart--;
//             }
//             int k = Integer.parseInt(s.substring(kStart +1, left));

//             String chunk = s.substring(left +1, right);

//             StringBuilder result = new StringBuilder(chunk.length() * k);
//             for(int i=0; i<k;i++)
//             {
//                 result.append(chunk);
//             }

//             StringBuilder rebuilt = new StringBuilder( (kStart + 1) + result.length() + (s.length() - (right + 1)));
//             rebuilt.append(s, 0, kStart + 1);
//             rebuilt.append(result);
//             rebuilt.append(s, right + 1, s.length());

//             s = rebuilt.toString();

//         }
//         return s;
//     }
// }

/** */
//Optimized Solution

class Solution
{
    public String decodeString(String s)
    {
        Deque<Integer> counts = new ArrayDeque<>();
        Deque<StringBuilder> builders = new ArrayDeque<>();
        builders.push(new StringBuilder());

        int num = 0;
        for(int i =0; i< s.length(); i++)
        {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9')
            {
                num = num * 10 +(c - '0');
            }
            else if(c == '[')
            {
                counts.push(num);
                builders.push(new StringBuilder());
                num = 0;
            }
            else if(c == ']')
            {
                int k = counts.pop();
                String chunk = builders.pop().toString();
                StringBuilder cur = builders.peek();
                for(int t = 0; t<k; t++)
                    cur.append(chunk);
            }
            else
            {
                builders.peek().append(c);
            }
        }
        return builders.pop().toString();
    }
}