package visitorPattern;

public class Dot implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing dot");
    }

    @Override
    public void move() {
        System.out.println("moving dot");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.export(this);
    }
}
