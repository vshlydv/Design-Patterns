package iteratorPattern;

import java.util.Iterator;

public class DinnerMenu {

    private static final int MAX_ITEM_COUNT = 6;
    private int numberOfItems;
    private MenuItem[] dinnerMenu;

    DinnerMenu() {
        dinnerMenu = new MenuItem[MAX_ITEM_COUNT];
        numberOfItems = 0;

        this.addItem("Chapati", 10, true);
        this.addItem("Paneer lababdar", 350, true);
        this.addItem("Buttern chicken", 400, false);
    }

    public void addItem(String name, int price, boolean isVegetarian) {
        if (numberOfItems >= MAX_ITEM_COUNT) {
            System.out.println("Sorry, no more items can be added");
            return;
        }
        dinnerMenu[numberOfItems] = new MenuItem(name, price, isVegetarian);
        numberOfItems++;
    }

    public Iterator<MenuItem> getIterator() {
        return new DinnerMenuIterator(dinnerMenu);
    }
}
