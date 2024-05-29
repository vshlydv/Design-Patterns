package visitorPattern;

public interface Shape {
    public void draw();
    public void move();

    public void accept(Visitor visitor);
}
