class Solution {
    public int[][] kClosest(int[][] points, int k) {

        // YOUR LOGIC HERE
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>();

        Comparator<int[]> c = (a, b) -> {
            int distanceA = a[0] * a[0] + a[1] * a[1];
            int distanceB = b[0] * b[0] + b[1] * b[1];

            return Integer.compare(distanceA, distanceB);
        };

        PriorityQueue<int[]> heap = new PriorityQueue<>(c);

        for (int[] point: points){
            heap.offer(point);
        }

        int[][] result = new int[k][2];

        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;
    }


}
