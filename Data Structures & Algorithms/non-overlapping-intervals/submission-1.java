class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Comparator<int[]> c = (a, b) -> a[1] - b[1];

        Arrays.sort(intervals, c);

        int res = 0;

        int prevEnd = intervals[0][1];
        for (int i=1; i<intervals.length; i++){
            if (intervals[i][0] < prevEnd){
                res++;
            }
            else{
                prevEnd = intervals[i][1];
            }
        }

        return res;
    }
}
