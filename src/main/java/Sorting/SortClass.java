package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortClass {

    public static void main (String[] args) {
        ArrayList<Duck> ducks = new ArrayList<Duck>();
        ducks.add(new Duck(23,234));
        ducks.add(new Duck(9,45));
        ducks.add(new Duck(10,1244));
        Collections.sort(ducks);
        ducks.forEach(s -> System.out.println(s.getId()));
        Comparator<Duck> duckComparator = Comparator.comparing(Duck::getWeight);
        Collections.sort(ducks,duckComparator);
        ducks.forEach(s -> System.out.println(s.getWeight()));
    }
}
