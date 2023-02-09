package zweid.kyu_7.one;

public class BeginnerSum {
    public static int getSum(int a, int b) {
        if (a == b) return a;
        int temp = 0;
        for (int i = Math.min(a, b); i < Math.max(a, b); i++) {
            temp += i;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(getSum(5, -2));
    }
}


