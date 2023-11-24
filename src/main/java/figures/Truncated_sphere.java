package figures;

import consts.Const;

import java.util.ArrayList;

public class Truncated_sphere extends Figure {
    public ArrayList<ArrayList<Integer>> coords;

    public Truncated_sphere(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
        if (coords.get(Const.POINT_ZERO).size() == Const.XYZ_COORDS &&
                coords.get(Const.POINT_ONE).size() == Const.XYZ_COORDS &&
                coords.get(Const.POINT_TWO).size() == Const.XYZ_COORDS) {
            double xZero = coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0); //radius
            double yZero = coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1);
            double zZero = coords.get(Const.POINT_ONE).get(2) - coords.get(Const.POINT_ZERO).get(2);
            double xOne = coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ZERO).get(0); //do sechenia
            double yOne = coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ZERO).get(1);
            double zOne = coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ZERO).get(2);
            double radius = Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2));
            double sechenie = Math.sqrt(Math.pow(xOne, 2) + Math.pow(yOne, 2) + Math.pow(zOne, 2));
            if (radius == sechenie) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void isArea() {
        ArrayList<Integer> tempPoint = new ArrayList<>();
        tempPoint.add(coords.get(0).get(0));
        tempPoint.add(coords.get(0).get(1));
        tempPoint.add(coords.get(2).get(2) - coords.get(0).get(2));
        coords.add(tempPoint);
        double xZero = coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0);
        double yZero = coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1);
        double zZero = coords.get(Const.POINT_ONE).get(2) - coords.get(Const.POINT_ZERO).get(2);
        double radius = Math.sqrt(Math.pow(xZero, 2) + Math.pow(yZero, 2) + Math.pow(zZero, 2));

        double xH = coords.get(Const.POINT_ZERO).get(0) - coords.get(Const.POINT_THREE).get(0);
        double yH = coords.get(Const.POINT_ZERO).get(1) - coords.get(Const.POINT_THREE).get(1);
        double zH = coords.get(Const.POINT_ZERO).get(2) - coords.get(Const.POINT_THREE).get(2);
        double hMin = Math.sqrt(Math.pow(xH, 2) + Math.pow(yH, 2) + Math.pow(zH, 2));

        double hMax = radius - hMin;
        double areaSegment = Math.PI * 2 * radius * hMax;
        double areaSphere = 2 * 2 * Math.PI * Math.pow(radius, 2);
        double radiusMin = Math.sqrt(Math.pow(radius, 2) - Math.pow(hMin, 2));
        double areaDisk = Math.PI * Math.pow(radiusMin, 2);
        double area = areaSphere - areaSegment + areaDisk;
        System.out.println(areaSphere + " -areaSphere\n" + areaSegment + " -areaSegment\n" + areaDisk + " -areaDisk\n" + radiusMin + "\n");
        System.out.printf("The figure area %.2f", area);
    }

    @Override
    public void isPerimeter() {
        System.out.println("\nThe figure has no perimeter");
    }

}
