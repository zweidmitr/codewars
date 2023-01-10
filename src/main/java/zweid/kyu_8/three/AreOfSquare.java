package zweid.kyu_8.three;

import java.util.Locale;

public class AreOfSquare {
    public static double squareArea(double A) {
        double radius = (A * 4) / (2 * Math.PI);
        return Math.pow(radius,2.) * 0.01d;
    }
}
