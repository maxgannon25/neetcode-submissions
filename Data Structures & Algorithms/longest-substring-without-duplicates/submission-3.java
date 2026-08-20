class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();

        int maxLength = 0;

        int l = 0;
        
        for (int r=l; r < s.length(); r++){
            if (!seen.contains(s.charAt(r))){
                seen.add(s.charAt(r));
            }
            else{
                while(seen.contains(s.charAt(r))){
                    seen.remove(s.charAt(l));
                    l++;
                }

                seen.add(s.charAt(r));
            }

            maxLength = Math.max(maxLength, seen.size());
        }

        return maxLength;
    }
}
