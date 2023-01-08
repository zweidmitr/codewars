package zweid.kyu_8.three;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Count {
    public static int[] monkeyCount(final int n) {
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 1;
//        }
//        return arr;
        return IntStream.rangeClosed(1, n).toArray();
    }
}
