class Solution {
    public int subarraySum(int[] nums, int k) {
        
        // prefixSum, count
        Map<Integer, Integer> prefixSums = new HashMap<>();

        prefixSums.put(0, 1);

        int curSum = 0;
        int res = 0;

        for (int n: nums){
            curSum += n;

            int diff = curSum - k;

            res += prefixSums.getOrDefault(diff, 0);
            prefixSums.put(curSum, prefixSums.getOrDefault(curSum, 0) + 1);
        }
        return res;
    }
}