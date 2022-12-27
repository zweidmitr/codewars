package zweid.kyu_8.one;

import static java.lang.Math.abs;

public class ReturnNegative {
    public static int makeNegative(final int x) {
//        return x <= 0 ? x : x * -1; // Your code here.
        return -abs(x);
    }
}
