class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Comparator<Integer> c = (a,b) -> (map.get(b) - map.get(a));

        PriorityQueue<Integer> pq = new PriorityQueue<>(c);

        for (int n: nums){
            if (!pq.contains(n)){
                pq.offer(n);
            }
        }

        int[] result = new int[k];

        while (k>0){
            result[k-1] = pq.poll();
            k--;
        }

        return result;
    }
}
