package zweid.kyu_7.one;

public class Covfefe {
    public static String covfefe(String tweet) {
        return tweet.contains("coverage")?tweet.replaceAll("coverage","covfefe"):tweet + " covfefe";
    }
}
