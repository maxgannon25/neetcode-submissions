class Solution {
    public boolean isValid(String s) {
    
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('(', ')');
        pairs.put('{', '}');
        pairs.put('[', ']');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()){
            if (pairs.containsKey(c)){
                stack.push(pairs.get(c));
            }
            else{
                if (stack.isEmpty() || stack.pop() != c){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
