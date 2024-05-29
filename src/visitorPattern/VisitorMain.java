package visitorPattern;

public class VisitorMain {
    public static void run() {
        Shape circle = new Circle();
        Shape dot = new Dot();
        ExportVisitor exportVisitor = new ExportVisitor();

        dot.accept(exportVisitor);
        circle.accept(exportVisitor);
    }
}
