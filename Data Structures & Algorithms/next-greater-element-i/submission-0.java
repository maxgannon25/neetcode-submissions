class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> indexes = new HashMap<>();

        Set<Integer> set = new HashSet<>();
        for (int n: nums1){
            set.add(n);
        }

        for (int i=0; i< nums2.length; i++){
            if (set.contains(nums2[i])){
                int r = i;
                while(r < nums2.length-1 && nums2[r] <= nums2[i]){
                    r++;
                }
                if (nums2[r] > nums2[i]){
                    indexes.put(nums2[i], nums2[r]);
                }
                else{
                    indexes.put(nums2[i], -1);
                }
            }
        }

        int[] result = new int[nums1.length];

        for (int i=0; i< nums1.length; i++){
            result[i] = indexes.get(nums1[i]);
        }

        return result;
    }
}