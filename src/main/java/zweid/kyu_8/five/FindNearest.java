package zweid.kyu_8.five;

public class FindNearest {
    public static int nearestSq(final int n) {
//        int near = (int) Math.round(Math.sqrt(n));
//        return near * near;
        return (int) Math.pow(Math.round(Math.sqrt(n)), 2);
    }

    public static void main(String[] args) {
        System.out.println(nearestSq(111));
    }
}
