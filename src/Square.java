import java.util.ArrayList;

public class Square extends Figure {
    public ArrayList<ArrayList<Integer>> coords;
    public Square(ArrayList<ArrayList<Integer>> coords) {
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
            xLine = Math.pow(coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double firstDiagonal = Math.sqrt(xLine + yLine);
            xLine = Math.pow(coords.get(Const.POINT_THREE).get(0) - coords.get(Const.POINT_ONE).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(1) - coords.get(Const.POINT_ONE).get(1), 2);
            double secondDiagonal = Math.sqrt(xLine + yLine);
            if (firstLine == thirdLine && firstLine == secondLine && secondLine == fourthLine && firstDiagonal == secondDiagonal) {
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
            xLine = Math.pow(coords.get(Const.POINT_TWO).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_TWO).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            zLine = Math.pow(coords.get(Const.POINT_TWO).get(2) - coords.get(Const.POINT_ZERO).get(2), 2);
            double firstDiagonal = Math.sqrt(xLine + yLine + zLine);
            xLine = Math.pow(coords.get(Const.POINT_THREE).get(0) - coords.get(Const.POINT_ONE).get(0), 2);
            yLine = Math.pow(coords.get(Const.POINT_THREE).get(1) - coords.get(Const.POINT_ONE).get(1), 2);
            zLine = Math.pow(coords.get(Const.POINT_THREE).get(2) - coords.get(Const.POINT_ONE).get(2), 2);
            double secondDiagonal = Math.sqrt(xLine + yLine + zLine);
            if (firstLine == thirdLine && firstLine == secondLine && secondLine == fourthLine && firstDiagonal == secondDiagonal) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void isArea() {
        if (coords.get(0).size() == Const.XY_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double firstLine = Math.sqrt(xLine + yLine);
            System.out.printf("The figure area %.2f", Math.pow(firstLine, 2));
        } else if (coords.get(0).size() == Const.XYZ_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double zLine = Math.pow(coords.get(Const.POINT_ONE).get(2) - coords.get(Const.POINT_ZERO).get(2), 2);
            double firstLine = Math.sqrt(xLine + yLine + zLine);
            System.out.printf("The figure area %.2f", Math.pow(firstLine, 2));

        }
    }

    @Override
    public void isPerimeter() {
        if (coords.get(0).size() == Const.XY_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double firstLine = Math.sqrt(xLine + yLine);
            System.out.printf("\nThe figure perimeter %.2f", 4 * firstLine);
        } else if (coords.get(0).size() == Const.XYZ_COORDS) {
            double xLine = Math.pow(coords.get(Const.POINT_ONE).get(0) - coords.get(Const.POINT_ZERO).get(0), 2);
            double yLine = Math.pow(coords.get(Const.POINT_ONE).get(1) - coords.get(Const.POINT_ZERO).get(1), 2);
            double zLine = Math.pow(coords.get(Const.POINT_ONE).get(2) - coords.get(Const.POINT_ZERO).get(2), 2);
            double firstLine = Math.sqrt(xLine + yLine + zLine);
            System.out.printf("\nThe figure perimeter %.2f", 4 * firstLine);
        }
    }

}