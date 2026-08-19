class Solution {
      public List<List<Integer>> threeSum(int[] nums) {

        // YOUR LOGIC HERE

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i=0; i < nums.length; i++){
            int left = i+ 1;
            int right = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0){
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left ++;
                    right --; 
                    
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }

                if (sum < 0){
                    left++;
                }

                if (sum > 0){
                    right--;
                }
            }

        }

        return result;
    }
}