class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        Set<Character> seen = new HashSet<>();

        int maxSize = 0;

        int l=0;
        for (int r=0; r < s.length(); r++){
            while(seen.contains(s.charAt(r))){
                seen.remove(s.charAt(l));
                l++;
            }

            seen.add(s.charAt(r));

            maxSize = Math.max(maxSize, seen.size());
        }

        return maxSize;
    }
}
