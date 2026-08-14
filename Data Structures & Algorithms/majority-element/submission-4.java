class Solution {
    public int majorityElement(int[] nums) {

         int count = 0;

        int candiate = 0;

        for (int n : nums){
            
            if (count == 0){
                candiate = n;
            }

            if (n == candiate){
                count++;
            }
            else{
                count--;
            }
        }

        return candiate;

        
    }
}