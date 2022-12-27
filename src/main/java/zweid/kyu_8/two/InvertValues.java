package zweid.kyu_8.two;

import java.util.Arrays;

public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(el -> el * -1).toArray();
    }

    public static void main(String[] args) {
        int[] input = new int[]{-1, 2, -3, 4, -5};
        System.out.println(Arrays.toString(invert(input)));
    }
}
