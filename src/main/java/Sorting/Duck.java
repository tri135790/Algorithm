package Sorting;

public class Duck implements Comparable<Duck>{

    private int id;

    public Duck(int id) {
        this.id = id;
    }


    @Override
    public int compareTo(Duck d) {
        return id - d.id;
    }
}
