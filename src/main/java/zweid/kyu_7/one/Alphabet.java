package zweid.kyu_7.one;

import java.util.Arrays;
import java.util.Objects;

public class Alphabet {
    /*
     don't work =(
     I have four positive integers, A, B, C and D, where A < B < C < D.
     The input is a list of the integers A, B, C, D, AxB, BxC, CxD, DxA in some order.
     Your task is to return the value of D.
    */
    public static int alphabet(int[] ns) {
        Arrays.sort(ns);
        return ns[3];
    }

    public static void main(String[] args) {
        System.out.println(alphabet(new int[]{20, 30, 6, 7, 4, 42, 28, 5}));
    }
}
