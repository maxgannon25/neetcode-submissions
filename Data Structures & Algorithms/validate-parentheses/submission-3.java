class Solution {
    public boolean isValid(String s) {
    
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('{', '}');
        pairs.put('[', ']');

        Deque<Character> stack = new ArrayDeque<>();

        if(s.toCharArray().length % 2 != 0){
            return false;
        }

        for (char c : s.toCharArray()){
            if (pairs.containsKey(c)){
                stack.push(pairs.get(c));
            }
            else{
                if (stack.peek() == null || stack.pop() != c){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
