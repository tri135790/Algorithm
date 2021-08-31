package LinkedList;

public class MergeTwoSortedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;




        while ( l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                head.next = l2;
                l2 = l2.next;
            } else {
                head.next = l1;
                l1=l1.next;
            }
            head = head.next;
        }
        head.next = l1 == null ? l2 : l1;
        return result.next;
    }

    public static void main (String[] args) {
        ListNode l1 = new ListNode(2);

        ListNode l2 = new ListNode(1);


        mergeTwoLists(l1,l2);
    }
}
