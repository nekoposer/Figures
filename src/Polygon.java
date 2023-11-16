import java.util.ArrayList;

public class Polygon extends Figure {
    public ArrayList<ArrayList<Integer>> coords;
    public Polygon(ArrayList<ArrayList<Integer>> coords) {
        this.coords = coords;
    }

    @Override
    public boolean isValid() {
        int chet = 0;
        if (coords.size() >= 3) {
            if ((coords.get(0).size() == 2) || (coords.get(0).size() == 3)) {
                for (int i = 0; i < coords.size() - 1; ++i) {
                    if (coords.get(i).size() != coords.get(i + 1).size()) {
                        return false;
                    }
                    for (int k = i + 1; k < coords.size(); ++k) {
                        if (coords.get(i).equals(coords.get(k))) {
                            ++chet;
                        }
                    }

                }
                if (coords.size() - chet < 3) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;

    }

    @Override
    public void isArea() {
        double sFirst = 0;
        double sSecond = 0;

        for (int i = 0; i < coords.size() - 1; ++i) {
            sFirst += coords.get(i).get(0) * coords.get(i + 1).get(1);
            sSecond += coords.get(i).get(1) * coords.get(i + 1).get(0);
        }
        double area = Math.abs(sFirst - sSecond) / 2;
        System.out.printf("The figure area %.2f", area);
    }

    @Override
    public void isPerimeter() {
        double perimeter = 0;
        for (int i = 1; i < coords.size(); ++i) {
            double xLine = Math.pow(coords.get(i).get(0) - coords.get(i - 1).get(0), 2);
            double yLine = Math.pow(coords.get(i).get(1) - coords.get(i - 1).get(1), 2);
            double Line = Math.sqrt(xLine + yLine);
            perimeter += Line;
        }
        perimeter += Math.sqrt(Math.pow(coords.get(0).get(0) - coords.get(coords.size() - 1).get(0), 2) + Math.pow(coords.get(0).get(1) - coords.get(coords.size() - 1).get(1), 2));
        System.out.printf("\nThe figure perimeter %.2f", perimeter);
    }

}