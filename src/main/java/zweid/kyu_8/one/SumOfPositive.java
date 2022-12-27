package zweid.kyu_8.one;

import java.util.Arrays;

public class SumOfPositive {
    public static int sum(int[] arr){
//        int temp = 0;
//        for (int i = 0; i <= arr.length - 1; i++) {
//            if (arr[i] > 0) temp += arr[i];
//        }
//        return temp;
        return Arrays.stream(arr).filter(v -> v >0).sum();
    }
}
