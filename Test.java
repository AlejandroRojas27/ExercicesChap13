import java.math.BigInteger;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

       long g = gcd(12, 10);
       //System.out.println(g);

        BigInteger big1 = new BigInteger("12");
        BigInteger big2 = new BigInteger("0");

        System.out.println(big1.compareTo(big2));




    }

    public static long gcd(long n, long d){
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if(n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

}




