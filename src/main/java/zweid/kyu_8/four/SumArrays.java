package zweid.kyu_8.four;

import java.util.Arrays;

public class SumArrays {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
        return sum1 + sum2;
    }
}
