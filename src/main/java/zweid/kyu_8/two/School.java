package zweid.kyu_8.two;

import java.util.Arrays;

public class School {
    public static int getAverage(int[] marks) {
        return (int) Arrays.stream(marks).average().getAsDouble();
    }
}
