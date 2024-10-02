package main.leetcode.dialletters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number
 */
public class DailLetters {
    private final Map<String, List<String>> map = new HashMap<>();

    public DailLetters() {
        map.put("2", Arrays.asList("a", "b", "c"));
        map.put("3", Arrays.asList("d", "e", "f"));
        map.put("4", Arrays.asList("g", "h", "i"));
        map.put("5", Arrays.asList("j", "k", "l"));
        map.put("6", Arrays.asList("m", "n", "o"));
        map.put("7", Arrays.asList("p", "q", "r", "s"));
        map.put("8", Arrays.asList("t", "u", "v"));
        map.put("9", Arrays.asList("w", "x", "y", "z"));
    }

    List<String> generate(String input) {
        List<String> result = new ArrayList<>();
        if (Objects.equals(input, ""))
            return result;



        return result;
    }



    public static void main(String[] args) {
        DailLetters dl = new DailLetters();
        dl.generate("24");
    }
}
