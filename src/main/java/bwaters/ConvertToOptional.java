package bwaters;

import java.util.List;
import java.util.Optional;

public class ConvertToOptional {

    // Implement a method that converts List<Optional<Integer>> to Optional<List<Integer>>

    // Return empty Optional if all list elements are empty.
    // Otherwise, return ONLY non-empty elements.

    public Optional<List<Integer>> convert(List<Optional<Integer>> optionals) {
        if  (optionals.isEmpty()) {
            return Optional.empty();
        }

        List<Integer> list = optionals.stream()
            .filter(Optional::isPresent)
            .map(Optional::get)
            .toList();

        if  (list.isEmpty()) {
            return Optional.empty();
        }

        return Optional.of(list);
    }
}
