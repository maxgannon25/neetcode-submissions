class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0; i < nums.length; i++){
            int left = i+ 1;
            int right = nums.length - 1;
            
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0){
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right --;
                }

                if (sum < 0){
                    left++;
                }

                if (sum > 0){
                    right--;
                }
            }

        }

        Set<List<Integer>> seen = new HashSet<>(result);
        return new ArrayList<>(seen);
    }
}
