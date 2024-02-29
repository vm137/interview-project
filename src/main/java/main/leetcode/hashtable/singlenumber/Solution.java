package main.leetcode.hashtable.singlenumber;

import java.util.HashSet;
import java.util.Set;

/**
 * 136. Single Number
 * <a href="https://leetcode.com/problems/single-number/">link</a>
 */
public class Solution {
  public int singleNumber(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        set.remove(num);
      } else {
        set.add(num);
      }
    }
    return set.stream().findAny().get();
  }
}
