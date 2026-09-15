package bwaters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConvertToOptionalTest {

    private ConvertToOptional convertToOptional;

    @BeforeEach
    void setUp() {
        convertToOptional = new ConvertToOptional();
    }

    @Test
    void shouldReturnEmptyOptionalWhenInputListIsEmpty() {
        Optional<List<Integer>> result = convertToOptional.convert(List.of());
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnEmptyOptionalWhenAllElementsAreEmpty() {
        List<Optional<Integer>> input = List.of(Optional.empty(), Optional.empty());
        Optional<List<Integer>> result = convertToOptional.convert(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnOnlyPresentElementsWhenAllElementsArePresent() {
        List<Optional<Integer>> input = List.of(Optional.of(1), Optional.of(2), Optional.of(3));
        Optional<List<Integer>> result = convertToOptional.convert(input);
        assertTrue(result.isPresent());
        assertEquals(List.of(1, 2, 3), result.get());
    }

    @Test
    void shouldReturnOnlyNonEmptyElementsWhenInputHasMixedOptionals() {
        List<Optional<Integer>> input = List.of(
            Optional.of(1),
            Optional.empty(),
            Optional.of(2),
            Optional.empty(),
            Optional.of(3)
        );
        Optional<List<Integer>> result = convertToOptional.convert(input);
        assertTrue(result.isPresent());
        assertEquals(List.of(1, 2, 3), result.get());
    }

    @Test
    void shouldReturnPresentListForSinglePresentElement() {
        List<Optional<Integer>> input = List.of(Optional.of(42));
        Optional<List<Integer>> result = convertToOptional.convert(input);
        assertTrue(result.isPresent());
        assertEquals(List.of(42), result.get());
    }

    @Test
    void shouldReturnEmptyOptionalForSingleEmptyElement() {
        List<Optional<Integer>> input = List.of(Optional.empty());
        Optional<List<Integer>> result = convertToOptional.convert(input);
        assertTrue(result.isEmpty());
    }
}