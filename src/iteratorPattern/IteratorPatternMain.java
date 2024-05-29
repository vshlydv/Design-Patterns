package iteratorPattern;

import java.util.Iterator;

public class IteratorPatternMain {

    public static void run() {
        DinnerMenu dinnerMenu = new DinnerMenu();
        PancakeBreakfastMenu pancakeBreakfastMenu = new PancakeBreakfastMenu();

        iterateOverMenu(dinnerMenu.getIterator());
        iterateOverMenu(pancakeBreakfastMenu.getIterator());
    }

    private static void iterateOverMenu(Iterator<MenuItem> iterator) {
        while(iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println("> " + item.name + ", " + item.price + ", " + item.isVegetarian);
        }
    }
}
