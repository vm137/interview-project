package main.yandex.onezero;

/**
 * Дан массив из нулей и единиц. Нужно определить, какой максимальный по длине подынтервал единиц
 * можно получить, удалив ровно один элемент массива.
 *
 * Удалять один элемент из массива обязательно.
 */

// assert(maxOnes(new int[]{1, 1, 0, 1})) == 3
// assert(maxOnes(new int[]{1, 1, 0, 0, 1})) == 2

public class Solution {
    public int maxOnes(int[] nums) {
        int maxInterval = 0;
        int interval = 0;
        for (int num : nums) {
            if (num == 1) {
                interval++;
            } else { // 0
                if (interval > maxInterval) {
                    maxInterval = interval;
                    interval = 0;
                }
            }
        }
        return Math.max(interval, maxInterval);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[] {1, 1, 0, 1};
        int maxOnes = s.maxOnes(nums);
        System.out.println(maxOnes);
    }
}
