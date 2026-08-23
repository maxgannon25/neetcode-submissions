class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m - 1;
        int j = n - 1;
        int write = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                // put nums1[i] at nums1[write]
                nums1[write] = nums1[i];
                i--;
            } else {
                // put nums2[j] at nums1[write]
                nums1[write] = nums2[j];
                j--;
            }
            write--;
        }

        while (j >= 0) {
            nums1[write] = nums2[j];
            j--;
            write--;
        }
    }
}