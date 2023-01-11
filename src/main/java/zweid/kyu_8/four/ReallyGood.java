package zweid.kyu_8.four;

import java.util.Arrays;

public class ReallyGood {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
//        int avg = 0;
//        for (int classPoint : classPoints) {
//            avg += classPoint;
//        }
//        return yourPoints > (avg / classPoints.length);
        return yourPoints > Arrays.stream(classPoints).average().orElse(0);
    }
}
