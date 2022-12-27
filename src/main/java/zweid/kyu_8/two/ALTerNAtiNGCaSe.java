package zweid.kyu_8.two;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ALTerNAtiNGCaSe {
    public static String toAlternativeString(String string) {
//        String[] arr = string.split("");
//        String result = "";
//        for (String s : arr) {
//            result += s.equals(s.toUpperCase())?s.toLowerCase() : s.toUpperCase();
//        }
//        return result;
        return Arrays.stream(string.split(""))
                .map(s -> s.matches("[A-Z]") ? s.toLowerCase():s.toUpperCase())
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
        System.out.println(toAlternativeString("Hello woRlD"));
    }
}
