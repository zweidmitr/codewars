package zweid.kyu_8.two;

public class StringTemplates {
    public static String buildString(String... args) {
        return "I like " + String.join(", ", args) + "!";
    }
}
