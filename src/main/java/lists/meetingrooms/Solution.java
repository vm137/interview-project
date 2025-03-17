package lists.meetingrooms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

/**
 * Description
 * Given an array of meeting time intervals consisting of start and end times [(s1,e1),(s2,e2),...] (si < ei),
 * determine if a person could attend all meetings.
 *
 * https://www.lintcode.com/problem/920/
 */

public class Solution {
    /**
     * @param intervals an array of meeting time intervals
     * @return if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() < 2) { return true; }
        Comparator<Interval> comparator = (a, b) -> {
            if (a.start > b.start) { return 1; }
            if (a.start < b.start) { return -1; }
            if (a.end > b.end) { return 1; }
            if (a.end < b.end) { return -1; }
            return 0;
        };
        intervals.sort(comparator);

        if (intervals.size() < 2) { return false; }
        for (int i = 0; i < intervals.size(); i++) {
            Interval first = intervals.get(i);
            for (int j = i + 1; j < intervals.size(); j++) {
                if (first.end > intervals.get(j).start) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Interval interval11 = new Interval(0, 30);
        Interval interval12 = new Interval(5, 10);
        Interval interval13 = new Interval(15, 20);
        List<Interval> intervals1 = Arrays.asList(interval11, interval12, interval13);
        boolean resp1 = solution.canAttendMeetings(intervals1);
        // false
        System.out.println(resp1);


        Interval interval21 = new Interval(5, 8);
        Interval interval22 = new Interval(6, 9);
        List<Interval> intervals2 = Arrays.asList(interval21, interval22);
        boolean resp2 = solution.canAttendMeetings(intervals2);
        // false
        System.out.println(resp2);
    }
}


/*
 * Input: intervals = [(0,30),(5,10),(15,20)]
 * Output: false
 * Explanation:
 * (0,30), (5,10) and (0,30),(15,20) will conflict
 *
 * Input: intervals = [(5,8),(9,15)]
 * Output: true
 * Explanation:
 * Two times will not conflict
 */
