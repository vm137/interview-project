package jmc.leo;

import java.util.ArrayList;
import java.util.List;

public class Application {

    List<Interval> merge(List<Interval> intervals) {
        List<Interval> merged = new ArrayList<>();

        for (int i = 0; i < intervals.size(); i++) {
            Interval newInterval = uniteWithAdjacent(i);
            if (newInterval != null) {
                merged.add(newInterval);
            }  //else {
//                merged.add(intervals.get(i));
            //}
        }

        return  merged;
    };

    Interval uniteWithAdjacent(int start) {
        Interval current = intervals.get(start);
        if (start == intervals.size() - 1) {return current;}

        for (int i = start + 1; i < intervals.size(); i++) {
            Interval next = intervals.get(i);

            if (next.start() >= current.start() && next.start() <= current.end()) {
                return new Interval(current.start(), next.end());
            }
        }
        return null;
    }

    static List<Interval> intervals = new ArrayList<>(List.of(
            new Interval(1, 3),
            new Interval(2, 6),
            new Interval(8, 10),
            new Interval(9, 12),
            new Interval(15, 18)
    ));

    public static void main(String[] args) {
        Application app = new Application();
        List<Interval> merged = app.merge(intervals);
        System.out.println(merged);
    }
}
