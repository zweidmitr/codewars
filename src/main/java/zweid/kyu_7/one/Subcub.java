package zweid.kyu_7.one;

import java.math.BigInteger;

import static java.math.BigInteger.valueOf;

public class Subcub {
    public static BigInteger subcuboids(int x, int y, int z) {
        //(((x+1)*x)/2 * ((y+1)*y)/2) * ((1+z) * (z/2))
        BigInteger xComponents = valueOf(x++).multiply(valueOf(x)).divide(valueOf(2));
        BigInteger yComponents = valueOf(y++).multiply(valueOf(y)).divide(valueOf(2));
        BigInteger zComponents = valueOf(z++).multiply(valueOf(z)).divide(valueOf(2));
        return xComponents.multiply(yComponents).multiply(zComponents);
    }
}
