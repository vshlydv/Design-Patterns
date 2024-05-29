package decoratorPattern;

public class Mocha extends BeverageDecorator {

    Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.20F + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha";
    }
}
