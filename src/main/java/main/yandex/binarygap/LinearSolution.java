package main.yandex.binarygap;

/**
 * Дан массив из нулей и единиц. Нужно определить, какой максимальный по длине подынтервал единиц
 * можно получить, удалив ровно один элемент массива.
 * Удалять один элемент из массива обязательно.
 */

// assert(maxOnes(new int[] {1, 1, 0, 1})) == 3
// assert(maxOnes(new int[] {1, 1, 0, 0, 1})) == 2

public class LinearSolution {
    public int maxOnes(int[] nums) {
        int maxNums = 0;
        int maxLeft = 0;
        int maxRight = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {

            }
        }

        return maxNums;
    }

    public int getMaxSubIntervalOfOnes(int[] array) {

        int max = 0;
        int sum = 0;
        int zCounter = 0;
        boolean firstZero = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 && zCounter < 2) {

                sum++;
                if (i == array.length - 1) {
                    max = sum;
                }
                zCounter = 0;
            } else {
                if (sum > 0 && firstZero) {
                    max = Math.max(sum, max);
                    sum = 0;
                }
                zCounter++;
                firstZero = true;
                if (zCounter > 2) {
                    max = Math.max(sum, max);
                    sum = 0;
                    firstZero = false;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LinearSolution s = new LinearSolution();
//        int[] nums = new int[] {1}; // 1
//        int[] nums = new int[] {1, 1, 0, 1}; // 3
        int[] nums = new int[] {0, 0, 1, 1, 0, 1}; // 3
//        int[] nums = new int[] {1, 1, 0, 0, 1}; // 2
//        int[] nums = new int[] {0, 1, 1, 0, 0, 1, 1}; // 2
//        int maxOnes = s.maxOnes(nums);
        int maxOnes = s.getMaxSubIntervalOfOnes(nums);
        System.out.println(maxOnes);
    }
}
