class Solution {
    public int compress(char[] chars) {
        int w = 0, i = 0;
        
        while (i < chars.length) {
            char ch = chars[i];
            int cnt = 0;
            
            while (i < chars.length && chars[i] == ch) {
                i++;
                cnt++;
            }
            
            chars[w++] = ch;
            
            if (cnt > 1) {
                for (char c : Integer.toString(cnt).toCharArray()) {
                    chars[w++] = c;
                }
            }
        }
        
        return w;
    }
}