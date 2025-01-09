package strings.longest.substring;

/**
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * If there is no common subsequence, return 0.
 * A subsequence of a string is a new string generated from the original string with some characters
 * (can be none) deleted without changing the relative order of the remaining characters.
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 * <a href="https://leetcode.com/problems/longest-common-subsequence/description/">leetcode</a>
 * <a href="https://ics.uci.edu/~eppstein/161/960229.html">DP algorithm</a>
 */
public class Solution2_DP {
    public int longestCommonSubsequence(String text1, String text2) {

        return 0;
    }



    public static void main(String[] args) {
        Solution2_DP solution = new Solution2_DP();
//        int len = solution.longestCommonSubsequence("abcabcbb", "abcabcbb");

        String text1 = "papmretkborsrurgtina";
        String text2 = "nsnupotstmnkfcfavaxgl";
        int len = solution.longestCommonSubsequence(text1, text2);

        System.out.println(len);
    }
}
