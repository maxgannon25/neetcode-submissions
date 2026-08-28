class Solution {
              // YOUR LOGIC HERE
    public static boolean isPalindrome(String s) {
        // YOUR LOGIC HERE


        int l = 0;
        int r = s.length() - 1;

        s = s.toLowerCase();

        while (l < r){
            while (!Character.isLetterOrDigit(s.charAt(l)) && l < r){
                l++;
            }

            while (!Character.isLetterOrDigit(s.charAt(r)) && l < r){
                r--;
            }

            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
            r--;
            l++;
        }

        return true;
    }
}
