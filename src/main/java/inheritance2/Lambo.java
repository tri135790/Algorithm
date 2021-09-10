package inheritance2;

import inheritance.Car;
import inheritance.Jumpable;

public class Lambo extends Car implements Jumpable {
    public static void hi() {
        System.out.println("hi lambo");
    }

    public void jump() {
        System.out.println("jump lambo");
    }

    public void hello() {
        System.out.println("hello lambo");
    }


    public static void main(String[] args) {
        Lambo lambo = new Lambo();
        lambo.hello();
        lambo.hi();

        Jumpable jumpable = new Lambo();
        jumpable.jump();
    }
}
