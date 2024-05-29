package visitorPattern;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }

    @Override
    public void move() {
        System.out.println("moving rectangle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.export(this);
    }
}
