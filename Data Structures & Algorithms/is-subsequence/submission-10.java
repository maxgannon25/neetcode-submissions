class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.equals("")){
            return true;
        }
        if (s.length() > t.length()){
            return false;
        }

        int matches = 0;

        int sPointer = 0;
        for (int tPointer=0; tPointer < t.length(); tPointer++){
            if (sPointer < s.length() && s.charAt(sPointer) == t.charAt(tPointer)){
                matches += 1;
                sPointer ++;
            }
        }

        return matches == s.length();
    }
}