package factoryPattern.factoryMethod;

public class NYStyleVeggiePizza extends Pizza {
    NYStyleVeggiePizza() {
        name = "New York style veggie pizza";
        dough = "Thin crust";
        sauce = "Spicy sauce with veggies";

        toppings.add("Shredded Mozzarella cheeze");
    }
}
