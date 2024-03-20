import java.util.Arrays;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        double[] t = Arrays.copyOf(s, n);
        for (int i = 3; i < n; i++) {
            t[i] = t[i-3] + t[i-2] + t[i-1];
        }
        return t;
    }
}
