package zweid.kyu_7.one;

public class DebugSum {
    public static int sumOfDigits(int n) {
        int res = 0;
        String[] dig = (n+"").split("");
        for (int i = 0; i < dig.length; i++) {
            res += Integer.parseInt(dig[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(55));
    }
}
