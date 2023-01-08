package zweid.kyu_8.three;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
//        return name.toLowerCase().charAt(0) == 'r' ? name + " plays banjo" : name + " does not play banjo";
        return name.toLowerCase().startsWith("r") ? name + " plays banjo" : name + " does not play banjo";
    }

}
