package Sorting;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

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

    public static void makeSound(String sound) {
        LearnToSpeak learner = System.out::println;
        DuckHelper.teacher(sound,learner);
        Consumer<List<Integer>> lamba = Collections::sort;
    }
}
