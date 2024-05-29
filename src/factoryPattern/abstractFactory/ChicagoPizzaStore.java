package factoryPattern.abstractFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientsAbstractFactory ingredientsAbstractFactory = new ChicagoIngredients();
        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new CheesePizza(ingredientsAbstractFactory);
            pizza.setName("Chicago style cheese pizza");
        }
        return pizza;
    }
}
