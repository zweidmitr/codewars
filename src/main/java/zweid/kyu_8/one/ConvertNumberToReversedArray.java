package zweid.kyu_8.one;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConvertNumberToReversedArray {
    public static int[] digitize(long n) {
//        String temp = "";
//        while (n >= 10) {
//            temp += n % 10 + " ";
//            n = n / 10;
//        }
//        temp += n;
//        String[] arr = temp.split(" ");
//        int[] res = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            res[i] = Integer.parseInt(arr[i]);
//        }
//        return res;
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(10755)));
    }
}
