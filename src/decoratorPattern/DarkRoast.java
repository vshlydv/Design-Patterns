package decoratorPattern;

public class DarkRoast extends Beverage {

    DarkRoast () {
        description = "Dark roast coffee";
    }

    @Override
    public float cost() {
        return 0.99F;
    }
}
