package factoryPattern.factoryMethod;

public class FactoryMethodPatternMain {
    public static void run() {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        Pizza pizza = nyStylePizzaStore.orderPizza("veggie");
        System.out.println("Vishal has ordered " + pizza.getName());
    }
}
