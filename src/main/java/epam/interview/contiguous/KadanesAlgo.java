package epam.interview.contiguous;

/**
 * Given an integer array, find a contiguous subarray within it that has the largest sum.
 * Example: Input {-2, 1, -3, 4, -1, 2, 1, -5, 4},
 * Output: Subarray with the largest sum is {4, -1, 2, 1} with sum 6
 */
public class KadanesAlgo {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        findMaxSubarray(nums);
    }

    public static void findMaxSubarray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        int start = 0, end = 0, s = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxEndingHere + nums[i]) {
                maxEndingHere = nums[i];
                s = i;
            } else {
                maxEndingHere += nums[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = s;
                end = i;
            }
        }

        // Print the result
        System.out.print("Subarray with the largest sum is: {");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("} with sum " + maxSoFar);
        // Subarray with the largest sum is: {4, -1, 2, 1} with sum 6
    }
}

/*
Explanation:
We track maxEndingHere to accumulate the current subarray sum.
maxSoFar keeps track of the best (maximum) subarray sum found so far.
Indices start, end, and s are used to track the subarray boundaries.
*/
