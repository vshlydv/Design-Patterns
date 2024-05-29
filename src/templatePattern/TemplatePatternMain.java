package templatePattern;

public class TemplatePatternMain {

    public static void run() {
        CaffeineBeverage coffeeWithHooks = new CoffeeWithHooks();
        CaffeineBeverage tea = new Tea();

        coffeeWithHooks.prepareBeverage();
        tea.prepareBeverage();
    }
}
