package numbers.smallest.positive.number;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * https://www.geeksforgeeks.org/dsa/find-the-smallest-positive-number-missing-from-an-unsorted-array/
 */
class FirstPositive {

    public static void main(String[] args) {
        int[] arr = new  int[] {1, 3, 6, 4, 1, 2};
        FirstPositive fp = new FirstPositive();
        System.out.println(fp.solution(arr));
    }

    // AI proposal
    public int solution(int[] arr) {
        Set<Integer> seenNumbers = new HashSet<>();
        for (int number : arr) {
            if (number > 0) {
                seenNumbers.add(number);
            }
        }
        for (int i = 1; i <= arr.length + 1; i++) {
            // If the current positive integer 'i' is not in the set, it's the smallest missing one.
            if (!seenNumbers.contains(i)) {
                return i;
            }
        }
        // This line should ideally not be reached if the logic is correct
        return 1;
    }

    public int mySolution2(int[] arr) {
        Comparator<Integer> comparator = Integer::compare;
        // to make the later search faster, we create sorted Set<Integer>
        SortedSet<Integer> set = new TreeSet<>(comparator);
        Arrays.stream(arr).forEach(set::add);

        for (int i = 1;; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
    }

    public int missingNumber3(int[] arr) {
        Arrays.sort(arr);

        // res will hold the current smallest missing number,
        // initially set to 1
        int res = 1;
        for (int j : arr) {

            // If we have found 'res' in the array,
            // 'res' is no longer missing, so increment it
            if (j == res) {
                res++;
            }

            // If the current element is larger than 'res',
            // 'res' cannot be found in the array,
            // so it is our final answer
            else if (j > res) {
                break;
            }
        }
        return res;
    }
}
