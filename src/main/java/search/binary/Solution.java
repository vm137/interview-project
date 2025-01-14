package search.binary;

public class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = nums[mid];
            if (midVal == target) { return mid; }
            if (midVal < target) { low = mid + 1; }
            if (midVal > target) { high = mid - 1; }
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int resp = solution.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9);
        System.out.println(resp);
    }
}
