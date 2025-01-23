package array.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/description/
 *
 * https://www.youtube.com/shorts/pFag4mBsO1I
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] resp = solution.twoSum(new int[] {2, 7, 11, 15}, 22);
        System.out.println(resp[0] + ":" + resp[1]);
    }
}
