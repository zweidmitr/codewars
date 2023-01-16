package zweid.kyu_8.four;

import java.util.Collections;
import java.util.List;

public class SortTextbooks {
    public static List<String> sort(List<String> textbooks) {
//        return textbooks.stream().sorted((a, b) -> a.toLowerCase().compareTo(b.toLowerCase())).toList();
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}
