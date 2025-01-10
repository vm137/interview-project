package lists.revertlinkedlist;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) { return head; }
        ListNode previous = null;
        ListNode current = head;
        ListNode nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        return previous;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode newHead = solution.reverseList(node1);
        newHead.print();
    }
}
