package LinkedList;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode preTemp = null; //0
        ListNode afterTemp = head.next; // 2
        while(afterTemp != null) {
            head.next = preTemp;
            preTemp = head;
            head = afterTemp;
            afterTemp = afterTemp.next;
        }
        head.next = preTemp;
        return head;
    }

    public static ListNode reverseList2(ListNode head) {
        return reverse(head,null);
    }

    public static ListNode reverse(ListNode head, ListNode preTemp) {
        if (head == null) {
            return preTemp;
        }
        ListNode next = head.next;
        head.next = preTemp;
        return reverse(next,head);
    }

    public static void main (String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        reverseList(listNode);

    }

}
