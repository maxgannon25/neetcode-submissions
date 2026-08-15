class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // YOUR LOGIC HERE
        // value, frequency
        Map<Integer, Integer> counts = new HashMap<>();

        Comparator<Integer> c = (a, b) -> counts.get(b) - counts.get(a);
        PriorityQueue<Integer> pq = new PriorityQueue<>(c);

        for (int n: nums){
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        for(int key: counts.keySet()){
            pq.add(key);
        }

        int[] res = new int[k];

        int element = 0;
        while (element < k){
            res[element] = pq.remove();
            element ++;
        }

        return res;
        
    }
}
