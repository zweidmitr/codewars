package zweid.kyu_8.one;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BeginnerLostWithoutMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(el -> el * 2).toArray();
    }
}
