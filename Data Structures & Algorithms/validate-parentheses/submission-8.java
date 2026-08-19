class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();

        Deque<Character> stack = new ArrayDeque<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c: s.toCharArray()){
            if (map.keySet().contains(c)){
                if (stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if (map.get(c) != open){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
