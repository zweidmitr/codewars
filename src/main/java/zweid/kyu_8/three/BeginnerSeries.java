package zweid.kyu_8.three;

public class BeginnerSeries {
    public static int Past(int h, int m, int s) {
//        return (h * 3600 + m * 60 + s) * 1000;
        return h * 3600_000 + m * 60_000 + s * 1000;
    }

    public static void main(String[] args) {
        System.out.println(Past(5, 19, 56));
    }
}
