package zweid.kyu_8;

import java.time.OffsetDateTime;

public class RemoveStringSpaces {
    public static String noSpace(final String x) {
        return x.replaceAll(" ","");
    }

    public static void main(String[] args) {
        String date = "2017-05-29T19:07:34+00";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(date);
        System.out.println(offsetDateTime.toLocalDateTime().toLocalTime());
    }
}
