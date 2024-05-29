package prototypePattern;

public abstract class Shape {
    private int x, y;
    private String color;

    Shape() {}

    Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    Shape(Shape shape) {
        if (null != shape) {
            // In java, private members of the object (apart from "this" object) are directly accessible within the same class to which the object belongs.
            this.x = shape.x;
            this.y = shape.y;
            this.color = shape.color;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape shape)) return false;
        return shape.x == this.x && shape.y == this.y && shape.color.equals(this.color);
    }

    public abstract Shape clone();
}
