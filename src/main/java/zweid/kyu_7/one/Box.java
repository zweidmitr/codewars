package zweid.kyu_7.one;

public class Box {
    public static int[][] createBox(int width, int length) {
        int[][] result = new int[length][width];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {

                int u = Math.min(i, j) + 1;
                int v = Math.min(length - i, width - j);

                result[i][j] = Math.min(u, v);
            }
        }

        return result;

    }
}
