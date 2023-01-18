package zweid.kyu_8.four;

import java.util.Arrays;

public class ExampleTwist {
    public static String[] kataExampleTwist() {
        String[] websites = new String[1000];
//        for (int i = 0; i < websites.length; i++) {
//            websites[i] = "codewars";
//        }
        Arrays.fill(websites, "codewars");
        return websites;
    }
}
