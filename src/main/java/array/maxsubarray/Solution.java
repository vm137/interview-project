package array.maxsubarray;

/**
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * Kadane's algorithm
 * https://www.youtube.com/shorts/lrH2sw-FmD4
 *
 */
public class Solution {
    // Kadane's algorithm
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Find the maximum sum ending at index i by either extending
            // the maximum sum subarray ending at index i - 1 or by
            // starting a new subarray from index i
            curSum = Math.max(curSum + nums[i], nums[i]);

            // Update res if maximum subarray sum ending at index i > res
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int resp = solution.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(resp);
    }
}
