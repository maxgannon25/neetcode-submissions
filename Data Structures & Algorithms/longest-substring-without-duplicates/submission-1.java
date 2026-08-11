class Solution {
    public static int lengthOfLongestSubstring(String s) {
        // YOUR LOGIC HERE

        Set<Character> substring = new HashSet<>();
        int l = 0;
        int r = 0;

        int longest = 0;
        while (r < s.length()){
            while (substring.contains(s.charAt(r))){
                substring.remove(s.charAt(l));
                l++;
            }

            substring.add(s.charAt(r));

            int length = r-l + 1;
            if (length > longest){
                longest = length;
            }

            r++;
        }

        return longest;
    }
}
