package zweid.kyu_7.one;

public class CatAndShelves {
    public static int solution(int start, int finish) {
        int temp = finish - start;
        return temp / 3 + temp % 3;
    }

    public static void main(String[] args) {
        System.out.println(solution(852, 929));
    }
}
