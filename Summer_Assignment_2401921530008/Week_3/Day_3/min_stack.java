class MinStack {
    Stack<Integer> st;
    Stack<Integer> mn;
    
    public MinStack() {
        st = new Stack<>();
        mn = new Stack<>();
    }
    
    public void push(int v) {
        st.push(v);
        if (mn.isEmpty() || v <= mn.peek()) {
            mn.push(v);
        }
    }
    
    public void pop() {
        if (st.pop().equals(mn.peek())) {
            mn.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mn.peek();
    }
}