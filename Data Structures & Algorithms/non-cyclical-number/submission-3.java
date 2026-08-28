class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        String digits = Integer.toString(n);

        while (true){
            int product = 0;

            for (char c: digits.toCharArray()){
                String digitString = Character.toString(c);
                int digit = Integer.valueOf(digitString);
                System.out.println(digit);

                product += digit * digit;
            }

            if (product == 1){
                return true;
            }

            if (seen.contains(product)){
                break;
            }
            else{
                seen.add(product);
                digits = String.valueOf(product);
            }
        }
        return false;
    }
}
