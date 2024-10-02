package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FnStream {
    public static void main(String[] args) {

        Function<List<Integer>, Integer> f = x -> x
            .stream()
            .map(i -> i * 2)
            .mapToInt(i -> 1)
            .distinct()
            .sum();

        Function<Integer, Integer> f2 = x -> x * 10;
        Function<Integer, Integer> f3 = x -> x * 100;

        int len = f.andThen(f2)
            .andThen(f3)
            .apply(Arrays.asList(1, 2, 2));

        System.out.println(len);

    }
}
