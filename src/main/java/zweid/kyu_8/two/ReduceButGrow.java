package zweid.kyu_8.two;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReduceButGrow {
    public static int grow(int[] x) {
//        int result = 1;
//        for (int i : x) {
//            result *= i;
//        }
//        return result;
        return IntStream.of(x).reduce(1, (a, b) -> a * b);
    }
}
