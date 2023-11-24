package figures;

import consts.Const;

import java.util.ArrayList;

public class Cylinder extends Figure {
    public ArrayList<ArrayList<Integer>> coords;

    public Cylinder(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    private int mark = 0;

    @Override
    public boolean isValid() {
        if (coords.size() == Const.POINT_THREE) {
            if (coords.get(Const.POINT_ZERO).size() == Const.XYZ_COORDS &&
                    coords.get(Const.POINT_ONE).size() == Const.XYZ_COORDS &&
                    coords.get(Const.POINT_TWO).size() == Const.XYZ_COORDS) {
                double xZero = coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0);
                double yZero = coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1);
                double zZero = coords.get(Const.POINT_ONE).get(2) - coords.get(Const.POINT_ZERO).get(2);
                double xOne = coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ZERO).get(0);
                double yOne = coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ZERO).get(1);
                double zOne = coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ZERO).get(2);
                double xTwo = coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ONE).get(0);
                double yTwo = coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ONE).get(1);
                double zTwo = coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ONE).get(2);
                double cosOne = (xZero * xOne + yZero * yOne + zZero * zOne) / (Math.sqrt(Math.pow(xOne, 2) + Math.pow(yOne, 2) + Math.pow(zOne, 2)) * Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2)));
                double cosTwo = (xZero * xTwo + yZero * yTwo + zZero * zTwo) / (Math.sqrt(Math.pow(xTwo, 2) + Math.pow(yTwo, 2) + Math.pow(zTwo, 2)) * Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2)));
                if (cosOne == 0) {
                    return true;
                } else if (cosTwo == 0) {
                    mark = 1;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void isArea() {
        double xZero = coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0);
        double yZero = coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1);
        double zZero = coords.get(Const.POINT_ONE).get(2) - coords.get(Const.POINT_ZERO).get(2);
        double height = Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2));

        double radius = 0;
        if (mark == 0) {
            double xOne = coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ZERO).get(0);
            double yOne = coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ZERO).get(1);
            double zOne = coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ZERO).get(2);
            radius = Math.sqrt(Math.pow(xOne, 2) + Math.pow(yOne, 2) + Math.pow(zOne, 2));
        } else {
            double xTwo = coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ONE).get(0);
            double yTwo = coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ONE).get(1);
            double zTwo = coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ONE).get(2);
            radius = Math.sqrt(Math.pow(xTwo, 2) + Math.pow(yTwo, 2) + Math.pow(zTwo, 2));
        }

        double area = 2 * Math.PI * radius * (radius + height);
        System.out.printf("The figure area %.2f", area);
    }

    @Override
    public void isPerimeter() {
        System.out.println("\nThe figure has no perimeter");
    }

}
