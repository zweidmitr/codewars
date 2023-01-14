package zweid.kyu_8.four;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountSheep {
    public static String countingSheep(int num) {
//        String rez = "";
//        for (int i = 1; i <= num; i++) {
//            rez += i + " sheep...";
//        }
//        return rez;
        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
    }
}
