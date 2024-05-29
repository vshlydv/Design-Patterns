package playGround;

public class Sugar extends CoffeeCondiment {
    Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return  coffee.getDescription() + " with sugar";
    }

    @Override
    public int getPrice() {
        return coffee.getPrice() + 5;
    }
}
