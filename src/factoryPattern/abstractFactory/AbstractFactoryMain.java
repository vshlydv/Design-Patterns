package factoryPattern.abstractFactory;

public class AbstractFactoryMain {
    public static void run() {
        PizzaStore nyStylePizzaStore = new NYPizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoPizzaStore();

        nyStylePizzaStore.orderPizza("cheese");
        chicagoStylePizzaStore.orderPizza("cheese");
    }
}
