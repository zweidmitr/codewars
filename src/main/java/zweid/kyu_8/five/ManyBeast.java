package zweid.kyu_8.five;

import java.util.Arrays;

public class ManyBeast {
    public static boolean feast(String beast, String dish) {
//        char start = beast.charAt(0);
//        char end = beast.charAt(beast.length() - 1);
//        char st = dish.charAt(0);
//        char en = dish.charAt(dish.length() - 1);
//        if (start == st && end == en) {
//            return true;
//        }
//        return false;
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
}
