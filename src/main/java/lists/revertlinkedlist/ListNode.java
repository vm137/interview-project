package lists.revertlinkedlist;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode next = this;
        while (next != null) {
            System.out.print(next.val + ", ");
            next = next.next;
        }
    }
}
