class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public MinStack() {}

    public void push(int val) {
        this.stack.push(val);
        Integer min = this.minStack.empty() ? val : Math.min(this.minStack.peek(), val);

        this.minStack.push(min);
    }

    public void pop() {
        this.stack.pop();
        this.minStack.pop();
    }

    public int top() {
        return this.stack.peek();
    }

    public int getMin() {
        return this.minStack.peek();
    }
}
