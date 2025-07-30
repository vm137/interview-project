package numbers;

/**
 * example: 5432
 * 3210 - zero position on the right (in given example = 2)
 * i..j
 * number of positions = 4
 *
 * link: https://leetcode.com/problems/palindrome-number/solutions/6826784/beats-100-step-by-step-visualization-java-c-python-beginner-friendly/
 */

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) { return false; }
        if (x == 0) { return true; }
        int numOfDigits = getNumOfDigits(x);
        if  (numOfDigits == 1) { return true; }

        int i = numOfDigits - 1;
        int j = 0;
        while (j < i) {
            if (getNumAtPosition(x, i) != getNumAtPosition(x, j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    private int getNumAtPosition(int x, int pos) {
        String str = Integer.toString(x);
        return str.charAt(pos);
    }

    private static int getNumOfDigits(int x) {
        if (x <= 0) { throw new IllegalArgumentException("x must be non zero positive number"); }
        return 1 + (int) Math.floor(Math.log10(x));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
        System.out.println(solution.isPalindrome(-121));
        System.out.println(solution.isPalindrome(10));
    }
}
