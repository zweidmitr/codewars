package zweid.kyu_8.three;

public class countPositive {
    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        if (input == null) return new int[0];
        if (input.length > 0) {
            for (int i : input) {
                if (i > 0) {
                    count++;
                } else {
                    sum += i;
                }
            }
            return new int[]{count, sum}; //return an array with count of positives and sum of negatives
        }
        return new int[0];
    }
}
