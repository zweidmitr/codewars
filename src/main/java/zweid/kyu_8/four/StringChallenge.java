package zweid.kyu_8.four;

public class StringChallenge {
    public static int strCount(String str, char letter) {
//        return str.length() - str.replaceAll(String.valueOf(letter),"").length();
        return (int) str.chars().filter(el -> el == letter).count();
    }
}
