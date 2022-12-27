package zweid.kyu_8.two;

public class Calculate {
    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5) return "Underweight";
        if (bmi <= 25.0) return "Normal";
        if (bmi <= 30.0) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        System.out.println(Calculate.bmi(80, 1.80));
    }
}
