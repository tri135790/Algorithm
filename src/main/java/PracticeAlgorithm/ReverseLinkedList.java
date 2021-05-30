package PracticeAlgorithm;

import java.util.LinkedList;

public class ReverseLinkedList {
  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<Integer>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.stream().forEach(System.out::println);
  }
}
