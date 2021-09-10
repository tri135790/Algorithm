package inheritance;

public class Car implements Jumpable  {

    @Override
    public void fly() {

    }

    private static int lx;

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
        System.out.println("jump car");
    }
    public static void hi() {
        System.out.println("hi car");
    }

    public void hello() {
        System.out.println("hello Car");
    }

    public static void main(String[] args) {
        Car car = new Car("dfdf");
        System.out.println(car.lx);
    }
}
