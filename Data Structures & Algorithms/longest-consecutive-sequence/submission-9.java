class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> numSet = new HashSet<>();

        for (int n : nums) {
            numSet.add(n);
        }

        int count = 0;
        int maxCount = 0;

        for (int n: numSet){
            if (numSet.contains(n-1)){
                continue;
            }
            int x = 0;
            while (numSet.contains(n+x)){
                count++;
                x++;
            }
            maxCount = Math.max(count, maxCount);
            count = 0;
        }

        return maxCount;
    }
}
