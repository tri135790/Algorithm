package Sorting;

public class Duck implements Comparable<Duck>{

    private int id;
    private int weight;

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public Duck(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public Duck(int id) {
        this.id = id;
    }


    @Override
    public int compareTo(Duck d) {
        return d.id - id;
    }
}
