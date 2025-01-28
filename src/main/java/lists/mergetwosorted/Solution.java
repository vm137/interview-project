package lists.mergetwosorted;

/**
 * Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode op = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                op.next = list1;
                list1 = list1.next;
            } else {
                op.next = list2;
                list2 = list2.next;
            }
            op = op.next;
        }
        op.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(3);
        node11.next = node12;
        ListNode node13 = new ListNode(5);
        node12.next = node13;

        ListNode node21 = new ListNode(2);
        ListNode node22 = new ListNode(4);
        node21.next = node22;
        ListNode node23 = new ListNode(6);
        node22.next = node23;

        ListNode head = solution.mergeTwoLists(node11, node21);
        head.print();
    }
}
