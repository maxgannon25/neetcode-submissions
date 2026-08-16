class Solution {
    public int longestConsecutive(int[] nums) {

        // YOUR LOGIC HERE

        Set<Integer> numSet = new HashSet<>();

            
        for (int n: nums){
            numSet.add(n);
        }

        int longest = 0;
        int length;
        for (int i=0; i<nums.length; i++){
            if (!numSet.contains(nums[i] - 1)){
                length = 0;

                while(numSet.contains(nums[i]+length)){
                    length++;
                    longest = Math.max(longest, length);
                }
            }
        }

        return longest;
    }
}
