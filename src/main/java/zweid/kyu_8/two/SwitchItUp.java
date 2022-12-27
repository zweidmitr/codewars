package zweid.kyu_8.two;

public class SwitchItUp {
    public static String switchItUp(int number) {
//        String result = "";
//        switch (number){
//            case 0 : return "Zero";
//            case 1 : return  "One";
//            case 2 : return "Two";
//            case 3 : return "Three";
//            case 4 : return "Four";
//            case 5 : return "Five";
//            case 6 : return "Six";
//            case 7 : return"Seven";
//            case 8 : return "Eight";
//            case 9 : return "Nine";
//        }
//        return "Nine";
        return new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}[number];
    }
}
