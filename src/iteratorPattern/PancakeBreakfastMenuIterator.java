package iteratorPattern;

import java.util.ArrayList;

public class PancakeBreakfastMenuIterator implements MenuIterator{

    private final ArrayList<MenuItem> items;
    private int position = 0;

    PancakeBreakfastMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return (position < items.size());
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }
}
