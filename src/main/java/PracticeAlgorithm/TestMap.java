package PracticeAlgorithm;

import java.util.LinkedList;

public class TestMap {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2,10);
        System.out.println(list.get(1));
    }
}
