package zweid.kyu_7.one;

import java.util.Arrays;

public class Time {
    public static String time(String time) {
        if (time == null || !time.matches("^\\d{2}:\\d{2}:\\d{2}$")) return null;

        var temp = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();
        int sec = temp[2] % 60;
        int min = (temp[1] + temp[2] / 60) % 60;
        int hours = (temp[0] + (temp[1] + temp[2] / 60) / 60) % 24;
        return String.format("%02d:%02d:%02d", hours, min, sec);
    }

    public static void main(String[] args) {
        System.out.println(time("24:01:01"));
        System.out.println(time("19:99:99"));
        System.out.println(time("09:10:01"));
    }
}
