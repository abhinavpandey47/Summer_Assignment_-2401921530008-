class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<StringBuilder> stk = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                nums.push(k);
                stk.push(cur);
                cur = new StringBuilder();
                k = 0;
            } else if (c == ']') {
                int n = nums.pop();
                StringBuilder tmp = stk.pop();
                for (int i = 0; i < n; i++) tmp.append(cur);
                cur = tmp;
            } else {
                cur.append(c);
            }
        }

        return cur.toString();
    }
}