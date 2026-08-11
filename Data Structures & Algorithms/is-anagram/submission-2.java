class Solution {
      public static boolean isAnagram(String first, String second) {
        // YOUR LOGIC HERE

        if (first.length() != second.length()){
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();

        for (int i=0; i < first.length(); i++){
            counts.put(first.charAt(i), counts.getOrDefault(first.charAt(i), 0) + 1);
        }

        for (int i=0; i < second.length(); i++){
            if (!counts.containsKey(second.charAt(i))){
                return false;
            }
            counts.put(second.charAt(i), counts.getOrDefault(second.charAt(i), 0) - 1);
        }

        for (char key: counts.keySet()){
            if (counts.get(key) != 0){
                return false;
            }
        }

        return true;
    }
}
