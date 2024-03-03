package main.leetcode.median.slidingwindow;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sliding-window-median/
 */
public class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int size = nums.length;
        int firstEl = 0;
        int lastEl = k;
        double[] medianArr = new double[size - k + 1];
        int mPointer = 0;

        while (lastEl <= size) {
            int[] range = Arrays.copyOfRange(nums, firstEl, lastEl);
            Arrays.sort(range);
            double median = findMedian(range, k);
            medianArr[mPointer++] = median;
            firstEl++;
            lastEl++;
        }
        return medianArr;
    }

    double findMedian(int[] range, int k) {
        if (k % 2 == 1) {
            // odd
            int index = (int) Math.floor(k / 2.);
            return range[index];
        } else {
            // even
            int lower = k / 2 - 1;
            int higher = lower + 1;
            long sum = (long) range[lower] + (long) range[higher];
            return sum / 2.;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
//        int k = 3;

//        int[] nums = {1, 4, 2, 3};
//        int k = 4;

        int[] nums = {2147483647, 2147483647};
        int k = 2;

        double[] mArr = s.medianSlidingWindow(nums, k);
        System.out.println(Arrays.toString(mArr));
    }
}

// not solved with big test case
// another approach should be taken
