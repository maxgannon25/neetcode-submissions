class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        Set<Character> seen = new HashSet<>();

        int maxSize = 0;

        int l=0;
        for (int r=0; r < s.length(); r++){
            if (!seen.contains(s.charAt(r))){
                seen.add(s.charAt(r));
            }
            else{
                while(s.charAt(l) != s.charAt(r)){
                    seen.remove(s.charAt(l));
                    l++;
                }
                l++;
            }
            maxSize = Math.max(maxSize, seen.size());
        }

        return maxSize;
    }
}
