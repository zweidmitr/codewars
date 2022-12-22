package zweid.kyu_8;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
//        String result = "";
//        if (repeat == 0 || string.equals("")) return result;
//        for (int i = 0; i < repeat; i++) {
//            result += string;
//        }
//        return result;
        return string.repeat(repeat);
    }

}
