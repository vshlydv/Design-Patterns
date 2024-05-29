package playGround;

public abstract class CoffeeCondiment implements Coffee {
    public Coffee coffee;

    CoffeeCondiment(Coffee coffee) {
        this.coffee = coffee;
    }
}
