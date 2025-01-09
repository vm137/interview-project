package strings.longest.substring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * If there is no common subsequence, return 0.
 * A subsequence of a string is a new string generated from the original string with some characters
 * (can be none) deleted without changing the relative order of the remaining characters.
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 * <a href="https://leetcode.com/problems/longest-common-subsequence/description/">leetcode</a>
 */
public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.contains(text2) || text2.contains(text1)) {
            return Math.min(text1.length(), text2.length());
        }

        Set<String> variants1 = new HashSet<>(strToVariations(text1));
        int maxLength = 0;
        for (String v2 : strToVariations(text2)) {
            if (variants1.contains(v2)) {
                maxLength = Math.max(maxLength, v2.length());
            }
        }
        return maxLength;
    }

    List<String> strToVariations(String str) {
        str = str.trim();
        int length = str.length();
        int max = (int) Math.pow(2, length) - 1;
        List<String> variants = new ArrayList<>();
        for (int i = 1; i <= max ; i++) {
            String fmt = "%" + length + "s";
            String binaryStr = Integer.toBinaryString(i);
            String paddedBinaryStr = String.format(fmt, binaryStr).replace(' ', '0');
            variants.add(extractStr(str, paddedBinaryStr));
        }
        return variants;
    }

    // autobus, 1001101 -> aobs
    String extractStr(String str, String mask) {
        char[] strCharArray = str.toCharArray();
        mask = new StringBuilder(mask).reverse().toString();
        char[] maskCharArray = mask.toCharArray();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            if ('1' == maskCharArray[i]) {
                sb.append(strCharArray[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int len = solution.longestCommonSubsequence("abcabcbb", "abcabcbb");
//        System.out.println(len);

        String text1 = "papmretkborsrurgtina";
        String text2 = "nsnupotstmnkfcfavaxgl";

//        String text1 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
//        String text2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        int len = solution.longestCommonSubsequence(text1, text2);
        System.out.println(len);
    }
}
