package zweid.kyu_8.three;

public class Goose {
    public static String duckDuckGoose(String[] players, int goose) {
        // Note: Player objects have a String field called 'name'.
        return players[(goose -1) % players.length];
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c", "d", "c", "e", "f", "g", "h", "z"};
        System.out.println(duckDuckGoose(arr, 10));
    }
}
