package strings.anagram;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        boolean resp = app.isAnagram("anagram", "garaman");
        System.out.println(resp);
    }

    boolean isAnagram(String s, String t) {
        String[] sSplit = s.split("");
        List<String> list = new java.util.ArrayList<>(Arrays.stream(sSplit).toList());
        for (String chr : t.split("")) {
            if (list.contains(chr)) {
                list.remove(chr);
            } else {
                return false;
            }
        }
        return list.isEmpty();
    }
}
