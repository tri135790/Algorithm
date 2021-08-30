package inheritance;


enum CoffeeSize {

    BIG(8), SMALL(2);
    CoffeeSize(int ounces) {
        this.ounces = ounces;
    }

    private int ounces;

    public int getOunces() {
        return ounces;
    }
}
public class Coffee {

    CoffeeSize size;

    public  static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.size = CoffeeSize.BIG;
    }

}
