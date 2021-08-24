package LinkedList;

public class RemoveNNode {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n ; i++) {
            if (fast.next == null) {
                if ( i == n - 1) {
                    head=head.next;
                    return head;
                }
            }
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
