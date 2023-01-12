package zweid.kyu_8.four;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] % i == 0) {
//                list.add(array[i]);
//            }
//        }
//        int[] res = new int[list.size()];
//        for (int i = 0; i < res.length; i++) {
//            res[i] = list.get(i);
//        }
//        return res;
        return IntStream.range(1, array.length).filter(i -> array[i] % i == 0).toArray();
    }
}
