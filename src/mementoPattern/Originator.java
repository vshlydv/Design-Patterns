package mementoPattern;

public class Originator {
    String text;

    Originator(String text) {
        this.text = text;
    }

    public String appendText(String text) {
        this.text = this.text.concat(text);
        return this.text;
    }

    public void printText() {
        System.out.println(text);
    }

    public void restore(Memento memento) {
        this.text  = memento.text;
    }

    public static class Memento {
        private String text;

        Memento(Originator originator) {
            this.text = originator.text;
        }
    }
}
