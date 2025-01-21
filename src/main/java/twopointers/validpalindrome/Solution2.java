package twopointers.validpalindrome;

/**
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * true O(n)
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 */

public class Solution2 {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return true;
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        boolean resp = solution.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(resp);
    }
}
