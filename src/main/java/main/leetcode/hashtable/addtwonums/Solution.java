package main.leetcode.hashtable.addtwonums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode l1Index = l1;
    ListNode l2Index = l2;
    int overload = 0;
    List<Integer> resultVals = new ArrayList<>();
    while (l1Index != null || l2Index != null) {
      int l1Val = l1Index == null ? 0 : l1Index.val;
      int l2Val = l2Index == null ? 0 : l2Index.val;
      int sum = l1Val + l2Val + overload;
      if (sum < 10) {
        overload = 0;
      } else {
        overload = 1;
        sum = sum - 10;
      }
      resultVals.add(sum);
      l1Index = (l1Index == null || l1Index.next == null) ? null : l1Index.next;
      l2Index = (l2Index == null || l2Index.next == null) ? null : l2Index.next;
    }
    if (overload == 1) {
      resultVals.add(1);
    }
    Collections.reverse(resultVals);

    int size = resultVals.size();
    ListNode firstNode = new ListNode(resultVals.get(0));
    for (int i = 1; i < size; i++) {
      firstNode = new ListNode(resultVals.get(i), firstNode);
    }
    return firstNode;
  }

  /**
   * <a href="https://leetcode.com/problems/add-two-numbers/">...</a>
   */
  public static void main(String[] args) {
    // 342 + 465 = 807
    ListNode l11 = new ListNode(3);
    ListNode l12 = new ListNode(4, l11);
    ListNode l13 = new ListNode(2, l12);
    ListNode l14 = new ListNode(2, l13);

    ListNode l21 = new ListNode(4);
    ListNode l22 = new ListNode(6, l21);
    ListNode l23 = new ListNode(5, l22);

    Solution s = new Solution();
    ListNode resultNode = s.addTwoNumbers(l14, l23);

    printNodes(l13);
    printNodes(l23);
    printNodes(resultNode);
  }

  private static void printNodes(ListNode start) {
    ListNode node = start;
    while (node != null) {
      System.out.print(node.val);
      if (node.next == null) {
        break;
      } else {
        System.out.print(" -> ");
        node = node.next;
      }
    }
    System.out.println("");
  }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val; ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
