package inheritance2;

import inheritance.Car;

public class Lambo extends Car {

    public void hello() {
        System.out.println("hello lambo");
    }

    public static void main(String[] args) {
        Car lambo = new Lambo();
        lambo.hello();
    }
}
