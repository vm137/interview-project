package array.majorityelement;

/**
 * Boyer-Moore Voting Algorithm
 */
public class BoyerMooreVoting {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];

        for (int n : nums) {
            if (count == 0) {
                candidate = n;
            }

            if (candidate == n) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        BoyerMooreVoting bmv = new BoyerMooreVoting();
        int[] nums = new int[] {3, 2, 3};
        System.out.println(bmv.majorityElement(nums));
    }
}
