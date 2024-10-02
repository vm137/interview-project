package epam.interview.palindrome;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    Map<String, Integer> map = new HashMap<>();

    private String longestPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j <= len; j++) {
                String substr = str.substring(i, j);
                if (substr.equals(reverseString(substr))) {
                    map.put(substr, substr.length());
                }
            }
        }

        return map.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse(null);
    }

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        LongestPalindrome palindrome = new LongestPalindrome();
        String str = "forgeeksskeegfor";
        String response = palindrome.longestPalindrome(str);
        System.out.println(response);
    }
}
