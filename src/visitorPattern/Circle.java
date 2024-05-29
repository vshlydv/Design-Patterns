package visitorPattern;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }

    @Override
    public void move() {
        System.out.println("moving circle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.export(this);
    }
}
