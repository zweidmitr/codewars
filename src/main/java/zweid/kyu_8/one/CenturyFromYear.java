package zweid.kyu_8.one;

public class CenturyFromYear {
    public static int century(int number) {
//        int result = 0;
//        if (number % 100 == 0) {
//            result = number / 100;
//        } else {
//            result = number / 100 + 1;
//        }
//        return result;
        return (number + 99) / 100;
    }
}
