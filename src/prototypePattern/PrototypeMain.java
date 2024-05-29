package prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {
    public static void run() {
        List<Shape> shapes = new ArrayList<>();

        Shape circle = new Circle(1, 2, "red", 5);
        Shape rectangle = new Rectangle(1, 2, "blue", 4, 5);

        shapes.add(circle);
        shapes.add(rectangle);

        cloneAndCompare(shapes);
    }

    public static void cloneAndCompare(List<Shape> shapes) {
        List<Shape> shapesCopy = new ArrayList<>();
        for (Shape shape: shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": And they are not identical (boo!)");
                }
            } else {
                System.out.println(i + ": Shapes are same objects (boo!)");
            }
        }
    }
}
