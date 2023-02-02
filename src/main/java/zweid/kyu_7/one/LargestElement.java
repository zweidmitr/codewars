package zweid.kyu_7.one;

import java.util.Arrays;

public class LargestElement {
    public static int[] largest(int n, int[] arr) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr,arr.length-n,arr.length);
    }
}
