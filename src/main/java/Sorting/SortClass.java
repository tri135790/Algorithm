package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortClass {

    public static void main (String[] args) {
        ArrayList<Duck> ducks = new ArrayList<Duck>();
        ducks.add(new Duck(1));
        ducks.add(new Duck(9));
        ducks.add(new Duck(10));
        Collections.sort(ducks);
    }
}
