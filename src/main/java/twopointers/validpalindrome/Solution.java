package twopointers.validpalindrome;

/**
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 */

public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.replaceAll("\\s+", "");
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) { return false; }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean resp = solution.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(resp);
    }
}
