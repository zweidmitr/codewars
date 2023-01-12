package zweid.kyu_8.four;

import java.util.Arrays;

public class SumArray {
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
