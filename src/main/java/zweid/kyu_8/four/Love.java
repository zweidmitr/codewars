package zweid.kyu_8.four;

public class Love {
    public static String howMuchILoveYou(int nb_petals) {
//        String[] text = new String[]{"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
//        return (nb_petals < 8) ? text[nb_petals - 1] : (nb_petals % 6 == 0) ? text[5] : text[(nb_petals % 6) - 1];
        String[] arr = {"not at all", "I love you", "a little", "a lot", "passionately", "madly"};
        return arr[nb_petals % 6];
    }
}
