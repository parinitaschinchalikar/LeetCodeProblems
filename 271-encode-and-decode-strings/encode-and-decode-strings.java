public class Codec
{
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) 
    {
        StringBuilder encoded = new StringBuilder();
        for(String s : strs)
        {
            encoded.append(s.length()).append("#").append(s);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) 
    {
        List<String> decoded = new ArrayList<>();

        int i=0;

        while(i < s.length())
        {
            int j=i;
            while(s.charAt(j) != '#' )
            {
                j++;
            }
            int len = Integer.parseInt(s.substring(i,j));
            j++;
            decoded.add(s.substring(j, j+len));
            i = j+len;
        }
        return decoded;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));