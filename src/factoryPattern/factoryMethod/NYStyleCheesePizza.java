package factoryPattern.factoryMethod;

public class NYStyleCheesePizza extends Pizza {
    NYStyleCheesePizza() {
        name = "New York style cheeze pizza";
        dough = "Thin crust";
        sauce = "Spicy sauce";

        toppings.add("Grated Reggiano cheeze");
    }

}
