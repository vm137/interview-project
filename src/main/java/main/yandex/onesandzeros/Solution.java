package main.yandex.onesandzeros;

/**
 * Дан массив из нулей и единиц. Нужно определить, какой максимальный по длине подынтервал единиц
 * можно получить, удалив ровно один элемент массива.
 *
 * Удалять один элемент из массива обязательно.
 */

// assert(maxOnes(new int[] {1, 1, 0, 1})) == 3
// assert(maxOnes(new int[] {1, 1, 0, 0, 1})) == 2

public class Solution {
    public int maxOnes(int[] nums) {
        int maxOnes = 0;
        if (nums.length == 0) {
            return 0;
        }

        if (nums[0] == 1) {
            maxOnes = maxRight(0, nums) + 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int localMax = maxLeft(i, nums) + maxRight(i, nums);
                maxOnes = Math.max(maxOnes, localMax);
            }
        }
        return maxOnes;
    }

    private int maxLeft(int pos, int[] nums) {
        int counter = 0;
        for (int i = pos - 1; i >= 0; i--) {
            if (nums[i] == 1) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    private int maxRight(int pos, int[] nums) {
        int counter = 0;
        for (int i = pos + 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[] {0, 1, 1, 0, 0, 1, 1};
//        int[] nums = new int[] {1};
        int maxOnes = s.maxOnes(nums);
        System.out.println(maxOnes);
    }
}
