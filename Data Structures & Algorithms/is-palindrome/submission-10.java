class Solution {
              // YOUR LOGIC HERE
    public static boolean isPalindrome(String s) {
        // YOUR LOGIC HERE

        int left = 0;
        int right = s.length() - 1;
        
        while (left < right){
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
