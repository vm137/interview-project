package epam.interview.contiguous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        App app = new App();
        app.contiguous(arr);
    }

    public int[] contiguous(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                List<Integer> subArr = new ArrayList<>();
                for (int j = i; j < k; j++) {
                    subArr.add(arr[j]);
                }
                System.out.println(subArr);
                int sum = sumList(subArr);
                map.put(sum, subArr);
            }
        }

        int i = map.keySet().stream().map(Number::intValue).max(Comparator.naturalOrder())
            .orElseThrow();

        int ii = map.keySet().stream().mapToInt(v -> v).max()
            .orElseThrow();

        System.out.println(map);
        System.out.println(i);
        System.out.println(ii);

        return arr;
    }

    private int sumList(List<Integer> arr) {
        return  arr.stream().mapToInt(Integer::intValue).sum();
    }
}
