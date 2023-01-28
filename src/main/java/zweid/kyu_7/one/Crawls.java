package zweid.kyu_7.one;

public class Crawls {
    public static int snail(int column, int day, int night) {
        int count = 0;
        while (column > 0) {
            column -= day;
            count++;
            if (column == 0 ||column <0) break;
            column += night;
        }
        return count; // your code here
    }

    public static void main(String[] args) {
        System.out.println(snail(86, 67, 50));
    }
}
