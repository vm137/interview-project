package array.majorityelement;

import java.util.HashMap;
import java.util.Map;

/**
 * Majority Element
 * <a href="https://leetcode.com/problems/majority-element/description/">leetcode</a>
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * Example:
 * Input: nums = [3,2,3]
 * Output: 3
 */
class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        if (length == 1) { return nums[0]; }

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                int quant = map.get(n);
                if (quant >= length / 2) {
                    return n;
                }
                map.put(n, quant + 1);
            } else {
                map.put(n, 1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{3, 2, 3};
        System.out.println(solution.majorityElement(nums));
    }
}
