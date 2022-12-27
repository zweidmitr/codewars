package zweid.kyu_8.two;

public class PossibleRun {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return fuelLeft * mpg >= distanceToPump;
    }
}
