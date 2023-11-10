package main.leetcode.hashtable.n2215;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
  public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    for(int n1: nums1){
      set1.add(n1);
    }
    for(int n2:nums2){
      set2.add(n2);
    }

    List<List<Integer>> ls = new ArrayList<>();
    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();

    for (int s1 : set1) {
      if (!set2.contains(s1)) {
        l1.add(s1);
      }
    }
    for (int s2 : set2) {
      if (!set1.contains(s2)) {
        l2.add(s2);
      }
    }

    ls.add(l1);
    ls.add(l2);
    return ls;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums1 = new int[] {1, 2, 3};
    int[] nums2 = new int[] {2, 4, 6};
    List<List<Integer>> diff = solution.findDifference(nums1, nums2);

    System.out.println(diff);
  }
}
