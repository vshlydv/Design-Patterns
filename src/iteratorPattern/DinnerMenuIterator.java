package iteratorPattern;

import java.util.Iterator;

public class DinnerMenuIterator implements Iterator<MenuItem> {

    private final MenuItem[] items;
    private int position = 0;

    DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
