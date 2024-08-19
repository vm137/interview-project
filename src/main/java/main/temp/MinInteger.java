package main.temp;

import java.util.Arrays;
import java.util.List;

public class MinInteger {

        public static void main(String[] args) {
        MinInteger mi = new MinInteger();
        int[] arr = new int[] {1, 3, 6, 4, 1, 2, -5};
        int solution = mi.minInt(arr);
        System.out.println(solution);
    }

    int minInt(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed()
            .filter(integer -> integer > 0)
            .sorted()
            .toList();

        if (list.get(0) > 1) {
            return 1;
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!list.contains(i)) {
                return i;
            }
        }
        double pow = Math.pow(1.1, 2);
        return 0;
    }
}
