package mementoPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Caretaker {
    Stack<Originator.Memento> history = new Stack<>();
    Originator originator;

    Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void restore() {
        if (!history.isEmpty())
            originator.restore(history.pop());
    }

    public void addHistory(Originator.Memento memento) {
        history.push(memento);
    }

}
