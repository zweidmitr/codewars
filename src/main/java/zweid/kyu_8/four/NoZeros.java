package zweid.kyu_8.four;

public class NoZeros {
    public static int noBoringZeros(int n) {
        while (Math.abs(n) > 9 && n % 10 == 0) n /= 10;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(noBoringZeros(960000));
    }
}
