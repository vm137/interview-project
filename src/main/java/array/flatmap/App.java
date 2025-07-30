package array.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        // map
        List<String> myList = Stream.of("a", "b")
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println(myList);

        // Flatmap
        List<List<String>> list2 = Arrays.asList(
            Arrays.asList("a", "b", "c"),
            Arrays.asList("d", "e"));

        System.out.println(list2
            .stream()
            .flatMap(strings ->  strings.stream())
//            .flatMap(Collection::stream)
            .map(String::toUpperCase)
            .toList());
    }
}
