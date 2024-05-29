package mementoPattern;

public class MementoPatternMain {
    public static void run() {
        Originator originator = new Originator("Initial text");
        Caretaker caretaker = new Caretaker(originator);
        originator.printText();

        caretaker.addHistory(new Originator.Memento(originator));
        originator.appendText(" : some text added");
        originator.printText();

        caretaker.addHistory(new Originator.Memento(originator));
        originator.appendText(" : some text added");
        originator.printText();

        caretaker.restore();
        originator.printText();

        caretaker.restore();
        originator.printText();

        caretaker.restore();
        originator.printText();

    }
}
