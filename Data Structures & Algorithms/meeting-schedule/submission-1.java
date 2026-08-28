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
        if (intervals.isEmpty()) {
            return true;
        }

        Comparator<Interval> c = (a, b) -> (a.start - b.start);
        intervals.sort(c);

        int prevEnd = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < prevEnd) {
                return false;
            }

            prevEnd = intervals.get(i).end;
        }

        return true;

    }
}
