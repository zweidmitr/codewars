package zweid.kyu_8.three;

public class QuarterOfTheYear {
    public static int quarterOf(int month) {
//        if (month <= 3 && month > 0) return 1;
//        if (month <= 6 && month > 3) return 2;
//        if (month <= 9 && month > 6) return 3;
//        return 4;
        return (int) Math.ceil(month / 3.);
    }
}
