package inheritance;

public class Car  {

    enum Size {BIG, SMALL};

    private String x;

    public Car() {}

    private Car(String x) {
        x = x;
    }

    public String getX() {
        return x;
    }

    public void jump() {

    }

    public void hello() {
        System.out.println("hello Car");
    }

    public static void main(String[] args) {
        Car car = new Car("dfdf");

    }
}
