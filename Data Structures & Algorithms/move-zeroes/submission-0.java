class Solution {
    public void moveZeroes(int[] nums) {
        
        for(int i=0; i <nums.length - 1; i++){
            int right = i+1;
            if (nums[i] == 0){
                while(right < nums.length - 1 && nums[right] == 0){
                    right++;
                }
                int tmp = nums[right];
                nums[right] = nums[i];
                nums[i] = tmp;
            } 
        }
    }
}