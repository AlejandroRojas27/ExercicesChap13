import java.math.BigInteger;

public class Ejercicio_13_18_UseTheRationalClass {
    public static void main(String[] args) {

        Rational ans = new Rational();

        for (int i = 1; i <= 99; i++) {
            ans = ans.add(new Rational(new BigInteger(String.valueOf(i)), new BigInteger(String.valueOf(i+1))));
        }

        System.out.println(ans);


    }
}
