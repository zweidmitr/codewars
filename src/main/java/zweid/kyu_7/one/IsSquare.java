package zweid.kyu_7.one;

public class IsSquare {
    public static boolean isSquare(int n) {
//        return n == Math.pow(Math.sqrt(n), 2);
        return Math.sqrt(n) % 1 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(221866871));
        System.out.println(Math.sqrt(221866871));
    }
}
