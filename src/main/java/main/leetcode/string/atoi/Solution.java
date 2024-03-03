package main.leetcode.string.atoi;

/**
 * String to Integer (atoi)
 * 1092 test cases passed.
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/">leetcode</a>
 */
public class Solution {
    public int myAtoi(String s) {
        if (s.isBlank()) { return 0; }
        int ind = 0;
        // remove leading spaces
        while (s.charAt(ind) == ' ') {
            ind++;
        }

        // sign
        int sign = 1;
        if (s.charAt(ind) == '-' || s.charAt(ind) == '+') {
            if (s.charAt(ind) == '-') { sign = -1; }
            ind++;
        }

        String s2 = s.substring(ind);
        if (s2.isBlank()) { return 0; }
        StringBuilder resultStrBf = new StringBuilder();
        int count = 0;
        for (char c : s2.toCharArray()) {
            if (c >= 48 && c <= 57) {
                resultStrBf.append(c);
                count++;
            } else {
                break;
            }
        }
        if (count == 0) { return 0; }

        String resultStr = resultStrBf.toString();
        while (resultStr.charAt(0) == '0') {
            if (resultStr.length() == 1) { return 0; }
            resultStr = resultStr.substring(1);
        }

        // clamp
        if (resultStr.length() > 10) {
            if (sign > 0) { return  Integer.MAX_VALUE; }
            else { return Integer.MIN_VALUE; }
        }

        long result = sign * Long.parseLong(resultStr);
        if (result >= Integer.MAX_VALUE) { return Integer.MAX_VALUE; }
        if (result <= Integer.MIN_VALUE) { return Integer.MIN_VALUE; }
        return (int) result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        String str = "  129 df";
//        String str = "91283472332";
//        String str = "+-12"; // 0
//        String str = "21474836460";
//        String str = "20000000000000000000";
//        String str = "4193 with words";
//        String str = "  0000000000012345678";
        String str = "00000-42a1234";
        int myAtoi = s.myAtoi(str);
        System.out.println(myAtoi);
    }
}


