package prototypePattern;

public class Circle extends Shape {
    private int radius;

    Circle() {
    }

    Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    Circle(Circle circle) {
        super(circle);
        if (null != circle) {
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle circle) || !super.equals(obj)) return false;
        return circle.radius == this.radius;
    }
}
