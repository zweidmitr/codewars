package zweid.kyu_8.one;

public class HumanYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
//        int[] result = new int[3];
//        if (humanYears == 1) {
//            result[0] = humanYears;
//            result[1] = 15;
//            result[2] = 15;
//        } else if (humanYears == 2) {
//            result[0] = humanYears;
//            result[1] = 24;
//            result[2] = 24;
//        } else {
//            result[0] = humanYears;
//            result[1] = 24 + (4 * (humanYears - 2));
//            result[2] = 24 + (5 * (humanYears - 2));
//        }
//
//        return result;
        return new int[]{humanYears, humanYears==1?15:16+ 4*humanYears, humanYears==1? 15:14+5*humanYears};
    }
}
