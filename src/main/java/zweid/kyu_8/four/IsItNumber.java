package zweid.kyu_8.four;

public class IsItNumber {
    public boolean isDigit(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }
}
