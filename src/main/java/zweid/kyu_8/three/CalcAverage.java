package zweid.kyu_8.three;

import java.util.Arrays;

public class CalcAverage {
    public static double find_average(int[] array) {

        return Arrays.stream(array).average().orElse(0);
    }
}
