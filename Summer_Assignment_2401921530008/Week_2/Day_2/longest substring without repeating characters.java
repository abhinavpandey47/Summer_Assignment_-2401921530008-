class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int ans = 0, i = 0;

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (mp.containsKey(ch) && mp.get(ch) >= i) {
                i = mp.get(ch) + 1;
            }
            mp.put(ch, j);
            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}
