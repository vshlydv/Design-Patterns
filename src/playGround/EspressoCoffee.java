package playGround;

public class EspressoCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public int getPrice() {
        return 1;
    }
}
