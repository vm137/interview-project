package main.yandex.binarygap;

import java.util.ArrayList;
import java.util.List;

public class HabrSolution {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0};

        System.out.println(maxOnesAfterRemoveItem(arr));
    }

    static int maxOnesAfterRemoveItem(int[] arr) {
        List<int[]> ones = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        int n = arr.length;
        int l = 0;

        for (int r = 0; r < n; r++) {
            if (arr[r] == 0) {
                ones.add(new int[]{l, r});
                zeros.add(r);
                l = r + 1;
            }
        }

        ones.add(new int[]{l, n});
        int maxOnes = 0;

        for (int i = 0; i < zeros.size(); i++) {
            int onesBefore = ones.get(i)[1] - ones.get(i)[0];
            int onesAfter = ones.get(i + 1)[1] - ones.get(i + 1)[0];
            maxOnes = Math.max(maxOnes, onesBefore + onesAfter);
        }

        return maxOnes;
    }
}
