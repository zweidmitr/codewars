package zweid.kyu_8.four;

import java.util.stream.IntStream;

public class Between {
    public static int[] between(int a, int b) {
//        return IntStream.range(a, b + 1).toArray();
        return IntStream.rangeClosed(a, b).toArray();
    }
}
