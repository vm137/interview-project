package lists.mergetwosorted;

// Single linked list
public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public void print() {
        ListNode next = this;
        while (next != null) {
            System.out.print(next.val + ", ");
            next = next.next;
        }
    }
}
