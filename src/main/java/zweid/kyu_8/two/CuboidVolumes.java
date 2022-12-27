package zweid.kyu_8.two;

import java.util.Arrays;

public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
//        int one = 1;
//        int two = 1;
//        for (int i : firstCuboid) {
//            one *= i;
//        }
//        for (int i : secondCuboid) {
//            two  = two *i;
//        }
//        return Math.abs(one - two);
        return Math.abs(firstCuboid[0] * firstCuboid[1] * firstCuboid[2] - secondCuboid[0] * secondCuboid[1] * secondCuboid[2]);
    }
}
