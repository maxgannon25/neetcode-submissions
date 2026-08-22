class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i< nums.length; i++){
            
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int elem = nums[i];

            int left = i+1;
            int right = nums.length-1;

            while (left <= right){

                int mid = (left+right)/2;
                int sum = nums[mid] + elem;

                if (sum > target){
                    right = mid - 1;
                }
                else if(sum < target){
                    left = mid + 1;
                }
                else{
                    return new int[]{i+1, mid+1};
                }
            }

        }

        return new int[]{};
    }
}
