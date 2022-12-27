package zweid.kyu_8.two;

import java.util.Arrays;

public class VowelRemover {
    public static void main(String[] args) {
        System.out.println(shortcut("how are you today?"));
    }

    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}
