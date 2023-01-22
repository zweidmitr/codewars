package zweid.kyu_8.five;

import java.util.Arrays;
import java.util.Objects;

public class FindNeedle {
    public static String findNeedle(Object[] haystack) {
//        for (int i = 0; i < haystack.length; i++) {
//            if (Objects.nonNull(haystack[i]))
//                if (haystack[i].equals("needle")) return "found the needle at position " + i;
//        }
//        return "";
        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }
}
