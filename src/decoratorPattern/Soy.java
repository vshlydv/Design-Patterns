package decoratorPattern;

public class Soy extends BeverageDecorator {

    Beverage beverage;

    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.15F + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Soy";
    }
}
