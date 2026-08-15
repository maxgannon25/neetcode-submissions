class Solution {
    public int findKthLargest(int[] nums, int k) {
         // YOUR LOGIC HERE
        Comparator<Integer> c = (a, b) -> b - a; // max-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(c);

        for (int n: nums){
            pq.add(n);
        }

        while (k>1){
            pq.remove();
            k--;
        }

        return pq.remove();
    }
}
