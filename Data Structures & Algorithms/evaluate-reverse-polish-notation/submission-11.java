class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque<Integer> stack = new ArrayDeque<>();

        for (String t: tokens){
            if (t.equals("+")){
                int val2 = stack.pop();
                int val1 = stack.pop();

                stack.push(val1 + val2);
            }
            else if (t.equals("-")){
                int val2 = stack.pop();
                int val1 = stack.pop();

                stack.push(val1 - val2);
            }
            else if (t.equals("*")){
                int val2 = stack.pop();
                int val1 = stack.pop();

                stack.push(val1 * val2);
            }
            else if (t.equals("/")){
                int val2 = stack.pop();
                int val1 = stack.pop();

                stack.push(val1 / val2);
            }
            else{
                stack.push(Integer.valueOf(t));
            }
        }

        return stack.pop();
    }
}
