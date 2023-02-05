package zweid.kyu_7.one;

public class GetNumber {
//    private static int value = 1;
//    private static int temp = 0;
//
//    public static int getNumber() {
//        temp++;
//        if (temp > 1) value *= 2;
//        return temp == 1 ? 1 : value;
//    }
    private static int value;

    public static int getValue() {
        value = value != 0 ? value * 2 : 1;
        return value;
    }
}
