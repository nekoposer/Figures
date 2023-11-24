package figures;

import consts.Const;

import java.util.ArrayList;

public class Parallelogram extends Figure {
    public ArrayList<ArrayList<Integer>> coords;
    public Parallelogram(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
        if (coords.get(Const.POINT_ZERO).size() == Const.XY_COORDS &&
                coords.get(Const.POINT_ONE).size() == Const.XY_COORDS &&
                coords.get(Const.POINT_TWO).size() == Const.XY_COORDS &&
                coords.get(Const.POINT_ZERO).size() == Const.XY_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double firstLine = Math.sqrt(xLine + yLine);
            xLine = Math.pow(coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ONE).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ONE).get(1), 2);
            double secondLine = Math.sqrt(xLine + yLine);
            xLine = Math.pow(coords.get(Const.POINT_THREE).get(0) - coords.get(Const.POINT_TWO).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(1) - coords.get(Const.POINT_TWO).get(1), 2);
            double thirdLine = Math.sqrt(xLine + yLine);
            xLine = Math.pow(coords.get(Const.POINT_ZERO).get(0) - coords.get(Const.POINT_THREE).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_ZERO).get(1) - coords.get(Const.POINT_THREE).get(1), 2);
            double fourthLine = Math.sqrt(xLine + yLine);

            if (firstLine == thirdLine && secondLine == fourthLine) {
                return true;
            }
        } else if (coords.get(Const.POINT_ZERO).size() == Const.XYZ_COORDS &&
                coords.get(Const.POINT_ONE).size() == Const.XYZ_COORDS &&
                coords.get(Const.POINT_TWO).size() == Const.XYZ_COORDS &&
                coords.get(Const.POINT_ZERO).size() == Const.XYZ_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double zLine = Math.pow(coords.get(Const.POINT_ONE).get(2) - coords.get(Const.POINT_ZERO).get(2), 2);
            double firstLine = Math.sqrt(xLine + yLine + zLine);
            xLine = Math.pow(coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ONE).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ONE).get(1), 2);
            zLine = Math.pow(coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ONE).get(2), 2);
            double secondLine = Math.sqrt(xLine + yLine + zLine);
            xLine = Math.pow(coords.get(Const.POINT_THREE).get(0) - coords.get(Const.POINT_TWO).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(1) - coords.get(Const.POINT_TWO).get(1), 2);
            zLine = Math.pow(coords.get(Const.POINT_THREE).get(2) - coords.get(Const.POINT_TWO).get(2), 2);
            double thirdLine = Math.sqrt(xLine + yLine + zLine);
            xLine = Math.pow(coords.get(Const.POINT_ZERO).get(0) - coords.get(Const.POINT_THREE).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_ZERO).get(1) - coords.get(Const.POINT_THREE).get(1), 2);
            zLine = Math.pow(coords.get(Const.POINT_ZERO).get(2) - coords.get(Const.POINT_THREE).get(2), 2);
            double fourthLine = Math.sqrt(xLine + yLine + zLine);

            if (firstLine == thirdLine && secondLine == fourthLine) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void isArea() {
        if (coords.get(0).size() == Const.XY_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            double yLine = Math.pow(coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double firstDiagonal = Math.sqrt(xLine + yLine);
            xLine = Math.pow(coords.get(Const.POINT_THREE).get(0) - coords.get(Const.POINT_ONE).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(1) - coords.get(Const.POINT_ONE).get(1), 2);
            double secondDiagonal = Math.sqrt(xLine + yLine);
            double xOne = coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ZERO).get(0);
            double yOne = coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ZERO).get(1);
            double xTwo = coords.get(Const.POINT_THREE).get(0) - coords.get(Const.POINT_ONE).get(0);
            double yTwo = coords.get(Const.POINT_THREE).get(1) - coords.get(Const.POINT_ONE).get(1);
            double cos = (xOne * xTwo + yOne * yTwo) / Math.sqrt((Math.pow(xOne, 2) + Math.pow(yOne, 2)) * (Math.pow(xTwo, 2) + Math.pow(yTwo, 2)));
            System.out.printf("The figure area %.2f", Math.sqrt(1 - Math.pow(cos, 2)) * firstDiagonal * secondDiagonal / 2);
            System.out.println(cos);
        } else if (coords.get(0).size() == Const.XYZ_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            double yLine = Math.pow(coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double zLine = Math.pow(coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ZERO).get(2), 2);
            double firstDiagonal = Math.sqrt(xLine + yLine + zLine);
            xLine = Math.pow(coords.get(Const.POINT_THREE).get(0) - coords.get(Const.POINT_ONE).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(1) - coords.get(Const.POINT_ONE).get(1), 2);
            zLine = Math.pow(coords.get(Const.POINT_THREE).get(2) - coords.get(Const.POINT_ONE).get(2), 2);
            double secondDiagonal = Math.sqrt(xLine + yLine + zLine);
            double xOne = coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ZERO).get(0);
            double yOne = coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ZERO).get(1);
            double zOne = coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ZERO).get(2);
            double xTwo = coords.get(Const.POINT_THREE).get(0) - coords.get(Const.POINT_ONE).get(0);
            double yTwo = coords.get(Const.POINT_THREE).get(1) - coords.get(Const.POINT_ONE).get(1);
            double zTwo = coords.get(Const.POINT_THREE).get(2) - coords.get(Const.POINT_ONE).get(2);
            double cos = (xOne * xTwo + yOne * yTwo + zOne * zTwo) / Math.sqrt((Math.pow(xOne, 2) + Math.pow(yOne, 2) + Math.pow(zOne, 2)) * (Math.pow(xTwo, 2) + Math.pow(yTwo, 2) + Math.pow(zOne, 2)));
            System.out.printf("The figure area %.2f", Math.sqrt(1 - Math.pow(cos, 2)) * firstDiagonal * secondDiagonal / 2);
        }
    }

    @Override
    public void isPerimeter() {
        if (coords.get(0).size() == Const.XY_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double firstLine = Math.sqrt(xLine + yLine);
            xLine = Math.pow(coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ONE).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ONE).get(1), 2);
            double secondLine = Math.sqrt(xLine + yLine);
            System.out.printf("\nThe figure perimeter %.2f", firstLine * 2 + secondLine * 2);
        } else if (coords.get(0).size() == Const.XYZ_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double zLine = Math.pow(coords.get(Const.POINT_ONE).get(2) - coords.get(Const.POINT_ZERO).get(2), 2);
            double firstLine = Math.sqrt(xLine + yLine + zLine);
            xLine = Math.pow(coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ONE).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ONE).get(1), 2);
            zLine = Math.pow(coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ONE).get(2), 2);
            double secondLine = Math.sqrt(xLine + yLine + zLine);
            System.out.printf("\nThe figure perimeter %.2f", firstLine * 2 + secondLine * 2);
        }
    }
}