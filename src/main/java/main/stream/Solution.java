package main.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public static Set<Integer> findDuplicateInStream(int[] array) {
        // Set to store the duplicate elements
        Set<Integer> items = new HashSet<>();
        return Arrays.stream(array)
            // Set.add() returns false if the element was already present in the set.
            // Hence, we filter such elements and add them to Set.
            .filter(n -> !items.add(n)).boxed().collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        int[] arr = {5, 13, 4, 21, 13, 27, 2, 59, 59, 34};

        System.out.println(findDuplicateInStream(arr));
    }
}
