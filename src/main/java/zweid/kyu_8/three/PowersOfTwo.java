package zweid.kyu_8.three;

import java.util.Arrays;

import static java.util.stream.LongStream.rangeClosed;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n) {
//        long[] arr = new long[n + 1];
//        for (int i = 0; i <= n; i++) {
//            arr[i] = (long) Math.pow(2, i);
//        }
//        return arr;
        return rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(2)));
    }
}
