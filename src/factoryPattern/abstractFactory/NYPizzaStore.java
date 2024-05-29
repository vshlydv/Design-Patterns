package factoryPattern.abstractFactory;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientsAbstractFactory ingredientsAbstractFactory = new NYStyleIngredients();
        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new CheesePizza(ingredientsAbstractFactory);
            pizza.setName("NY style cheeze pizza");
        }

        return pizza;
    }
}
