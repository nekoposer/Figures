package figures;

import consts.Const;

import java.util.ArrayList;

public class Sphere extends Figure {
    public ArrayList<ArrayList<Integer>> coords;

    public Sphere(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
        if (coords.size() == 2) {
            if ((coords.get(0).size() == coords.get(1).size()) && (coords.get(0).size() == Const.XY_COORDS || coords.get(0).size() == Const.XYZ_COORDS)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void isArea() {

        double radius = 0;
        if (coords.get(0).size() == Const.XY_COORDS) {
            double xLength = Math.pow((coords.get(1).get(0) - coords.get(0).get(0)), 2);
            double yLength = Math.pow((coords.get(1).get(1) - coords.get(0).get(1)), 2);
            radius = Math.sqrt(xLength + yLength);
        } else {
            double xLength = Math.pow((coords.get(1).get(0) - coords.get(0).get(0)), 2);
            double yLength = Math.pow((coords.get(1).get(1) - coords.get(0).get(1)), 2);
            double zLength = Math.pow((coords.get(1).get(2) - coords.get(0).get(2)), 2);
            radius = Math.sqrt(xLength + yLength + zLength);
        }
        double area = 2 * 2 * Math.PI * Math.pow(radius, 2);
        System.out.printf("The figure area %.2f", area);
    }

    @Override
    public void isPerimeter() {
        System.out.println("\nThe figure has no perimeter");
    }

}
