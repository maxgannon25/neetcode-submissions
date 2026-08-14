class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        this.stack.push(val);

        if (!this.minStack.isEmpty()){
            if (val < this.minStack.peek()){
                minStack.push(val);
            }
            else{
                minStack.push(minStack.peek());
            }
        }
        else{
            this.minStack.push(val);
        }
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
