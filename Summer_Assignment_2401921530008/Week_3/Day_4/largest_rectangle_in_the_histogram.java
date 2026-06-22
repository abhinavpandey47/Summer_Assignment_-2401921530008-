class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int mx = 0;
        
        for (int i = 0; i <= heights.length; i++) {
            int h = (i == heights.length) ? 0 : heights[i];
            
            while (!st.isEmpty() && heights[st.peek()] > h) {
                int ht = heights[st.pop()];
                int wd = st.isEmpty() ? i : i - st.peek() - 1;
                mx = Math.max(mx, ht * wd);
            }
            
            st.push(i);
        }
        
        return mx;
    }
}