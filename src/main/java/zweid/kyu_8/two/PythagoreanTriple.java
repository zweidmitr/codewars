package zweid.kyu_8.two;

public class PythagoreanTriple {
    public static int pythagoreanTriple(int[] triple) {
//        int max = Integer.MIN_VALUE;
//        int one = 0;
//        int two = 0;
//        for (int i : triple) {
//            max = Math.max(max, i);
//        }
//        for (int i : triple) {
//            if (one != 0 && i != max) {
//                two = i;
//                continue;
//            }
//            if (i != max) one = i;
//        }
//
//        if (one * one + two * two == max * max) {
//            return 1;
//        }
//        return 0;
        return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] p1 = {3, 4, 5};
        int[] p2 = {3, 5, 7};
        System.out.println(pythagoreanTriple(p1));
        System.out.println(pythagoreanTriple(p2));
    }
}
