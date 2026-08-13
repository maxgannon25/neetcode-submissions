class Solution {
    public int[] twoSum(int[] nums, int target) {

        //value, index
        Map<Integer, Integer> mappings = new HashMap<>();

        for (int i=0; i< nums.length; i++){
            int diff = target - nums[i];
            if (mappings.containsKey(diff)){
                return new int[]{(mappings.get(diff)), i};
            }
            mappings.put(nums[i], i);
        }
        return new int[]{};
    }
}
