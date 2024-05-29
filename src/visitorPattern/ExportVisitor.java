package visitorPattern;

public class ExportVisitor implements Visitor {
    @Override
    public void export(Shape shape) {
        System.out.println("Exporting share");
    }

    @Override
    public void export(Dot dot) {
        System.out.println("Exporting dot");
    }

    @Override
    public void export(Circle circle) {
        System.out.println("Exporting circle");
    }

    @Override
    public void export(Rectangle rectangle) {
        System.out.println("Exporting rectangle");
    }
}
