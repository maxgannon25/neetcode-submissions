class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int write = nums1.length-1;

        int nums1Pointer = m-1;
        int nums2Pointer = n-1;

        while (nums1Pointer >= 0 && nums2Pointer >= 0){
            if (nums2[nums2Pointer] > nums1[nums1Pointer]){
                nums1[write] = nums2[nums2Pointer];
                nums2Pointer--;
            }
            else {
                nums1[write] = nums1[nums1Pointer];
                nums1Pointer--;
            }
            write--;
        }

        while (nums2Pointer >= 0){
            nums1[write] = nums2[nums2Pointer];
            nums2Pointer--;
            write--;
        }
    }
}