package zweid.kyu_8.five;

public class Ternary {
    public static String describeAge(int a) {
        return "You're a(n) " + (a < 13 ? "kid" : a < 18 ? "teenager" : a < 65 ? "adult" : "elderly");
    }
}
