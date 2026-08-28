/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Comparator<Interval> c = (a, b) -> (a.start - b.start);
        intervals.sort(c);

        int prev = 0;

        for (int i=0; i<intervals.size(); i++){
            Interval current = intervals.get(i);

            int start = current.start;

            if (start < prev){
                return false;
            }
            prev = current.end;
        }

        return true;

    }
}
