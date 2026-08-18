class Solution {
    public int findKthLargest(int[] nums, int k) {

        Comparator<Integer> c = (a, b) -> b - a;
        PriorityQueue<Integer> pq = new PriorityQueue<>(c);

        
        for (int n: nums){
            pq.add(n);
        }

        while (k > 1){
            pq.remove();
            k--;
        }

        return pq.poll();
    }
}
