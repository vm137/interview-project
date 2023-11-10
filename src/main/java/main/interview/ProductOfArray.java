package main.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ProductOfArray {
  public static void main(String[] args) {
    ProductOfArray pa = new ProductOfArray();

    int[] arr = {4, 5, 0};
    int[] product = pa.product(arr);
    System.out.println(Arrays.toString(product));
  }

  int[] product(int[] arr) {
    // zero or one size arr
    if (arr.length <= 1) {
      return arr.clone();
    }

    int[] out = new int[arr.length]; // initialized with 0s
    long zCount = Arrays.stream(arr).filter(e -> e == 0).count();
    int productWithoutZeros = Arrays.stream(arr).reduce(1, (a, b) -> {
      if (a == 0) a = 1;
      if (b == 0) b = 1;
      return a * b;
    });

    if (zCount == 0) {
      for (int i = 0; i < arr.length; i++) {
        out[i] = productWithoutZeros / arr[i];
      }
      return out;
    }

    // 1 zero
    if (zCount == 1) {
      int zPos = IntStream.range(0, arr.length)
          .filter(i -> arr[i] == 0)
          .findFirst()
          .orElse(-1);
      out[zPos] = productWithoutZeros;
    }

    // > 2 - return all zeros

    return out;
  }


  // ======== second variant ===========
  int[] product_v2(int[] arr) {
    return null;
  }
}
