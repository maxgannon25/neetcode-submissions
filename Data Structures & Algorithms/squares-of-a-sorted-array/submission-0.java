class Solution {
    public int[] sortedSquares(int[] nums) {
        

        int l=0;
        int r=nums.length-1;
        
        int[] result = new int[nums.length];

        int last = nums.length-1;

        while (l<=r){

            int sr = nums[r] * nums[r];
            int sl = nums[l] * nums[l];

            if (sr >= sl){
                result[last] = sr;
                r--;
            }
            else{
                result[last] = sl;
                l++;
            }
            last--;
        }

        return result;
    }
}