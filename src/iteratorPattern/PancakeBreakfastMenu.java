package iteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeBreakfastMenu {

    private ArrayList<MenuItem> pancakeBreakfastMenu;

    PancakeBreakfastMenu() {
        pancakeBreakfastMenu = new ArrayList<>();

        this.addItem("Banana pancakes", 150, true);
        this.addItem("Rose berry pancake", 200, true);
        this.addItem("Egg banana pancake", 200, false);
    }

    public void addItem(String name, int price, boolean isVegetarian) {
        pancakeBreakfastMenu.add(new MenuItem(name, price, isVegetarian));
    }

    public Iterator<MenuItem> getIterator() {
        return pancakeBreakfastMenu.iterator();
    }
}
