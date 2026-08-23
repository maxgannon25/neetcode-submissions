class Solution {
    public boolean isIsomorphic(String s, String t) {
        
          if (s.length() != t.length()){
            return false;
        }
        if (s.equals(t)){
            return true;
        }

        Map<Character, Character> word1 = new HashMap<>();
        Map<Character, Character> word2 = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            // check mappings
            if (!word1.containsKey(a) && !word2.containsKey(b)){
                word1.put(a, b);
                word2.put(b, a);
            }
            else{
                if (word1.getOrDefault(a, '.') != b){
                    return false;
                }
            }
        }


        return true;
    }
}