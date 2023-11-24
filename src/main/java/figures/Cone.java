package figures;

import consts.Const;

import java.util.ArrayList;

public class Cone extends Figure {
    public ArrayList<ArrayList<Integer>> coords;

    public Cone(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
        if (coords.get(Const.POINT_ZERO).size() == Const.XYZ_COORDS &&
                coords.get(Const.POINT_ONE).size() == Const.XYZ_COORDS &&
                coords.get(Const.POINT_TWO).size() == Const.XYZ_COORDS) {
            double xZero = coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0);
            double yZero = coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1);
            double zZero = coords.get(Const.POINT_ONE).get(2) - coords.get(Const.POINT_ZERO).get(2);
            double xOne = coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ZERO).get(0);
            double yOne = coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ZERO).get(1);
            double zOne = coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ZERO).get(2);
            double cosOne = (xZero * xOne + yZero * yOne + zZero * zOne) / (Math.sqrt(Math.pow(xOne, 2) + Math.pow(yOne, 2) + Math.pow(zOne, 2)) * Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2)));
            if (cosOne == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void isArea() {
        double xZero = coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0); // точка на окружности - центр окружности
        double yZero = coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1);
        double zZero = coords.get(Const.POINT_ONE).get(2) - coords.get(Const.POINT_ZERO).get(2);

        double xTwo = coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ONE).get(0); // вершина - точка окружности
        double yTwo = coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ONE).get(1);
        double zTwo = coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ONE).get(2);

        double radius = Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2));
        double length = Math.sqrt(Math.pow(xTwo, 2) + Math.pow(yTwo, 2) + Math.pow(zTwo, 2));
        double area = Math.PI * radius * (radius + length);
        System.out.printf("The figure area %.2f", area);
    }

    @Override
    public void isPerimeter() {
        System.out.println("\nThe figure has no perimeter");
    }

}
