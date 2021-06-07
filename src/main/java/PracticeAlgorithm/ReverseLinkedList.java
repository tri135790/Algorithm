package PracticeAlgorithm;

import java.util.LinkedList;

public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode prev = null;
    while(curr != null) {
      ListNode temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
  return prev;
  }
  public void deleteNode(ListNode node) {
    while(node.next.next != null) {
      node.val = node.next.val;
      node = node.next;
    }
    node.val = node.next.val;
    node.next = null;
  }


  public static void main(String[] args) {

  }
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
