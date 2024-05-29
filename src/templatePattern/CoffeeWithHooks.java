package templatePattern;

import java.util.Scanner;

public class CoffeeWithHooks extends CaffeineBeverage {

    CoffeeWithHooks() {
        super();
        name = "Coffee";
    }

    @Override
    public void brew() {
        System.out.println("Brewing coffee..");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding milk and sugar...");
    }

    // This a hooked method which is overridden by subclass
    @Override
    protected boolean needCondiments() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need condiments with the beverage? (Y/N)");
        String answer = scanner.nextLine();
        return "Y".equalsIgnoreCase(answer);
    }
}
