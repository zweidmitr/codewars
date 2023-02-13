package zweid.kyu_7.one;

public class SimpleString {
    public static int[] Solve(String word) {
        //enjoy coding
        return new int[]{
                word.replaceAll("[^A-Z]", "").length(),
                word.replaceAll("[^a-z]", "").length(),
                word.replaceAll("[^0-9]", "").length(),
                word.replaceAll("[\\w]", "").length()
        };

    }
}
