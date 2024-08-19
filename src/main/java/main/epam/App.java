package main.epam;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// given int array [ 3, -1, 5, -2, 0, 2, -3, 5 ]
// find contiguous (adjacent) subarray with max sum
public class App {
    public static void main(String[] args) {
        App app = new App();

        int[] arr = new int[] { 3, -1, 5, -2, 0, 2, -3, 5 };
        int[] maxSumSubArray = app.findMaxSumSubArray(arr);
        System.out.println(Arrays.toString(maxSumSubArray));
    }

    int[] findMaxSumSubArray(int[] arr) {
        int length = arr.length;
        Map<Integer, List<Integer>> results = new HashMap<>();

        for (int i = 0; i < length - 1; i++) {
            List<Integer> subArr = new ArrayList<>();
            int sum = 0;

            for (int j = 0; j < length - i; j++) {
                int el = arr[i];
                subArr.add(el);
                sum += el;
            }
            results.put(sum, subArr);
        }

        int max = results.keySet().stream()
            .max(Integer::compare)
            .orElseThrow();

        List<Integer> integers = results.get(max);
        int[] finalArray = integers.stream().mapToInt(Integer::intValue).toArray();

        return finalArray;
    }
}
