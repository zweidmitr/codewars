package zweid.kyu_8.four;

import java.util.Arrays;

public class FindNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(el -> el % divider == 0).toArray();
    }

}
