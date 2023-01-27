package zweid.kyu_8.five;

import java.util.ArrayList;
import java.util.List;

public class Loop {
    public static List CreateList(int number) {
        List list = new ArrayList();
        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        return list;
    }
}
