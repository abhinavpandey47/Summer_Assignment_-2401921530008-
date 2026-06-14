class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int st = 0, mx = 1;
        
        for (int i = 0; i < n; i++) {
            int l = i, r = i;
            while (r < n - 1 && s.charAt(r) == s.charAt(r + 1)) r++;
            i = r;
            while (l > 0 && r < n - 1 && s.charAt(l - 1) == s.charAt(r + 1)) {
                l--;
                r++;
            }
            if (r - l + 1 > mx) {
                mx = r - l + 1;
                st = l;
            }
        }
        
        return s.substring(st, st + mx);
    }
}