package prototypePattern;

public class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    Rectangle(Rectangle rectangle) {
        super(rectangle);
        if (null != rectangle) {
            this.width = rectangle.width;
            this.height = rectangle.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle rectangle) || !super.equals(obj)) return false;
        return rectangle.width == this.width && rectangle.height == this.height;
    }
}
