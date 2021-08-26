package Sorting;

public class Crate<T> {

    private T contents;
    public T emptyCrate() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public static void main(String[] args) {
        Crate<String> stringCrate = new Crate<>();
        stringCrate.setContents("hahaha");
        Crate<Integer> integerCrate = new Crate<>();
        integerCrate.setContents(3);
        System.out.println(stringCrate.emptyCrate());
        System.out.println(integerCrate.emptyCrate());
    }
}
