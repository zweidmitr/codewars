package zweid.kyu_8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
//        int count = 0;
//        for (Boolean arrayOfSheep : arrayOfSheeps) {
//            if (arrayOfSheep != null && arrayOfSheep) count++;
//        }
//        return count;
        return Collections.frequency(Arrays.asList(arrayOfSheeps), true);
    }
}
