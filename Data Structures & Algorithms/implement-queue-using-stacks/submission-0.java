class MyQueue {

        private Deque<Integer> input;
    private Deque<Integer> output;

    public MyQueue() {
        // YOUR LOGIC HERE
        this.input = new ArrayDeque<>();
        this.output = new ArrayDeque<>();
    }

    public void push(int x) {
        // YOUR LOGIC HERE
        this.input.push(x);
    }

    public int pop() {
        // YOUR LOGIC HERE
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.pop();
    }

    public int peek() {

        // YOUR LOGIC HERE
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        return output.peek();
    }

    public boolean empty() {

        // YOUR LOGIC HERE
        if (input.isEmpty() && output.isEmpty()){
            return true;
        }

        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */