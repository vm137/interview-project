package search.minimuninrotatedarray;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * Write an algorithm that runs in O(log n) time.
 */
public class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                right = mid;
            }
        }
        return nums[left];
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int resp0 = solution.findMin(new int[] {0, 1, 2, 3, 4, 5, 6, 7});
        System.out.println(resp0);

        int resp1 = solution.findMin(new int[] {4, 5, 6, 7, 8, 9, 0, 1, 2, 3});
        System.out.println(resp1);

        int resp2 = solution.findMin(new int[] {7, 8, 0, 1, 2, 3, 4, 5, 6});
        System.out.println(resp2);
    }
}
