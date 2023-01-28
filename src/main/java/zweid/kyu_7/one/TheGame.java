package zweid.kyu_7.one;

import java.util.Random;

public class TheGame {
    public static int makeMove(int sticks) {
        // Your code goes here. Good luck!
//        Random random = new Random();
//        if (sticks % 4 == 0) return random.nextInt(3) + 1;
//        return sticks % 4;
        return sticks % 4 == 0 ? 1 : sticks % 4;
    }
}
