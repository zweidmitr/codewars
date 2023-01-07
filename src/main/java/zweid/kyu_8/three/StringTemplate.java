package zweid.kyu_8.three;

import java.util.Arrays;

public class StringTemplate {
    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
}
