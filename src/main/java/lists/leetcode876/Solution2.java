package lists.leetcode876;

/**
 * Leetcode 876. Middle of the Linked List
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/description/">...</a>
 */
public class Solution2 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        ListNode head = new ListNode(1);
        ListNode middleNode = solution.middleNode(head);
        System.out.println(middleNode.val);
    }
}
