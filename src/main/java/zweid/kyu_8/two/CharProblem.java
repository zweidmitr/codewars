package zweid.kyu_8.two;

public class CharProblem {
    public static int howOld(final String herOld) {
        var split = herOld.split("");
//        return Integer.parseInt(split[0]);
        return Character.getNumericValue(herOld.charAt(0));
    }
}
