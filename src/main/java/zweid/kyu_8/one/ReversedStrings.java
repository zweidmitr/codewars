package zweid.kyu_8.one;

import java.lang.reflect.Array;
import java.util.Stack;

public class ReversedStrings {
    public static String solution(String str) {
//        String newcad="";
//        for(int i = str.length()-1; i >= 0; i--){
//            newcad += str.charAt(i);
//        }
//        return newcad;
        return new StringBuilder(str).reverse().toString();
    }
}
