class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int last = 1;

        for (int i=0; i < nums.length; i++){
            prefix[i] = last;
            last = last * nums[i];
        }

        last = 1;
        int[] postfix = new int[nums.length];

         for (int i=nums.length - 1; i >= 0; i--){
            postfix[i] = last * prefix[i];
            last = last * nums[i];
         }

        return postfix;
    }
}  
