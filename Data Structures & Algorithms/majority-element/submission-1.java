class Solution {
    public int majorityElement(int[] nums) {

        if (nums.length == 1){
            return nums[0];
        }

        int majPoint = nums.length / 2;

        Arrays.sort(nums);
        int k = 0;
        Set<Integer> seen = new HashSet<>();

        for (int i=1; i< nums.length; i++){
            int num = nums[i];
            if(!seen.contains(num)){
                seen.add(num);
                k = 0;
            }

            if (nums[i] == nums[i-1]){
                k++;
                if (k == majPoint){
                    return num;
                }
            }
        }
        return 0;


        
    }
}