package zweid.kyu_8.two;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindMaximumAndMinimum {
    public int min(int[] list) {
//        int min = Integer.MAX_VALUE;
//        for (int i : list)
//            min = Math.min(min, i);
//        return min;
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
//        int max = Integer.MIN_VALUE;
//        for (int i : list)
//            max = Math.max(max,i);
//        return max;
        return Arrays.stream(list).max().getAsInt();
    }
}
