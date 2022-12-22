package zweid.kyu_8;

public class BasicMath {
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        if(op.equals("+")) result = v1 + v2;
        if(op.equals("-")) result = v1 - v2;
        if(op.equals("*")) result = v1 * v2;
        if(op.equals("/")) result = v1 / v2;
        return result;
    }
}
