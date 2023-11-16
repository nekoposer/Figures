import java.util.ArrayList;

public class Figure {

    public static Figure createFigure(String enter, ArrayList<ArrayList<Integer>> coords) {
        if (enter.equals("FIGURE")) {
            return new Figure();
        } else if (enter.equals("CIRCLE")) {
            return new Circle(coords);
        } else if (enter.equals("SQUARE")) {
            return new Square(coords);
        } else if (enter.equals("RECTANGLE")) {
            return new Rectangle(coords);
        } else if (enter.equals("PARALLELOGRAM")) {
            return new Parallelogram(coords);
        } else if (enter.equals("TRIANGLE")) {
            return new Triangle(coords);
        } else if (enter.equals("POLYGON")) {
            return new Polygon(coords);
        } else if (enter.equals("SPHERE")) {
            return new Sphere(coords);
        } else if (enter.equals("TRUNCATED_SPHERE")) {
            return new Truncated_sphere(coords);
        } else if (enter.equals("CYLINDER")) {
            return new Cylinder(coords);
        } else if (enter.equals("CONE")) {
            return new Cone(coords);
        }
        return null;
    }

    public boolean isValid() {
        return true;
    }

    public void isArea() {
        return;
    }

    public void isPerimeter() {
        return;
    }


}


