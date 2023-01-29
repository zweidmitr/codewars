package zweid.kyu_7.one;

import java.util.Arrays;

public class Tribonacci {
    public double[] tribonacci(double[] s, int n) {
        double[] rez= Arrays.copyOf(s, n);
        for(int i=3;i<n;i++){
            rez[i]=rez[i-1]+rez[i-2]+rez[i-3];
        }
        return rez;
    }
}
