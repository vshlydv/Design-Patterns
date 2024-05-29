package playGround;

public class Cream extends CoffeeCondiment {

    public Cream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with cream";
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 10;
    }
}
