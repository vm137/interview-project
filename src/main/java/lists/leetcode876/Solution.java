package lists.leetcode876;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode 876. Middle of the Linked List
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/description/">...</a>
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode pointer = head;
        List<ListNode> list = new ArrayList<>();
        while (pointer != null) {
            list.add(pointer);
            pointer = pointer.next;
        }
        int middle = (int) Math.ceil(list.size() / 2.);
        return list.get(middle);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        ListNode middleNode = solution.middleNode(head);
        System.out.println(middleNode);
    }
}
