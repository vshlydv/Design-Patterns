package playGround;

public class CappuccinoCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
