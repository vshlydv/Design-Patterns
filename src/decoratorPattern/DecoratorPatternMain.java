package decoratorPattern;

public class DecoratorPatternMain {

    public static void run() {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());

        Beverage beverage1 = new Soy(darkRoast);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
