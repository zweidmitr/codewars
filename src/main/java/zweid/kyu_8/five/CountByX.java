package zweid.kyu_8.five;

import java.util.stream.IntStream;

public class CountByX {
    public static int[] countBy(int x, int n) {
//        int[] array = new int[n];
//        array[0] = x;
//        for (int i = 1; i < array.length; i++) {
//            array[i] = array[i - 1] + x;
//        }
//        return array;
        return IntStream.rangeClosed(x, n)
                .map(elem -> elem * x)
                .toArray();
    }
}
