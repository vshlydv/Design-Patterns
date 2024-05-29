package factoryPattern.factoryMethod;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheeze")) {
            return new NYStyleCheesePizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
