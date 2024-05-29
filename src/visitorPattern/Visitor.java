package visitorPattern;

public interface Visitor {
    public void export(Shape shape);
    public void export(Dot dot);
    public void export(Circle circle);
    public void export(Rectangle rectangle);
}
