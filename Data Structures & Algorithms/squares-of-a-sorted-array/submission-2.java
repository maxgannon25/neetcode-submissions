class Solution {
    public int[] sortedSquares(int[] nums) {
        

        int l=0;
        int r=nums.length-1;
        
        int[] result = new int[nums.length];

        int resIndex = nums.length-1;

        while (l<=r){

            int sr = nums[r] * nums[r];
            int sl = nums[l] * nums[l];

            if (sr >= sl){
                result[resIndex] = sr;
                r--;
            }
            else{
                result[resIndex] = sl;
                l++;
            }
            resIndex--;
        }

        return result;
    }
}