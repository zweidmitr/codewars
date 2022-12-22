package zweid.kyu_8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestInteger {
    public static int findSmallestInt(int[] args) {
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < args.length; i++) {
//            min = Math.min(args[i], min);
//        }
//        return min;
//        return IntStream.of(args).min().getAsInt();
        Arrays.sort(args);
        return args[0];
    }
}
