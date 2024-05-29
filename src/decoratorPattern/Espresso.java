package decoratorPattern;

public final class Espresso extends Beverage {

    Espresso() {
        description = "Espresso coffee";
    }

    @Override
    public float cost() {
        return 1.99F;
    }
}
