class Solution {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) ->
                Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            int[] next = intervals[i];

            // They overlap
            if (next[0] <= current[1]) {

                current[1] = Math.max(
                        current[1],
                        next[1]
                );

            } else {

                // No overlap
                result.add(current);
                current = next;
            }
        }

        // Add final interval
        result.add(current);

        return result.toArray(new int[result.size()][]);
    }
}
