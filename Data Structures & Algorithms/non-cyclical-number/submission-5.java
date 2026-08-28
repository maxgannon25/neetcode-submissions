class Solution {
    public boolean isHappy(int n) {

        // Your solution here

        Set<Integer> seen = new HashSet<>();

        String digits = Integer.toString(n);

        //
        while (true){
            int product = 0;

            for (char c : digits.toCharArray()) {
                int digit = c - '0';
                product += digit * digit;
            }

            if (product == 1){
                return true;
            }

            if (seen.contains(product)){
                return false;
            }
            seen.add(product);
            digits = String.valueOf(product);
        }
    }
}
