import java.math.BigInteger;
import java.util.Arrays;

public class Ejercicio_13_16_CreateARationalNumberCalculator {
    public static void main(String[] args) {


        String[] str = args[0].split(" ");

        Rational r1 = toRational(extractRationalNumber(str[0]));
        Rational r2 = toRational(extractRationalNumber(str[2]));

        int x = 1;

        Rational ans = switch (str[1].charAt(0)) {
            case '+' -> r1.add(r2);
            case '-' -> r1.subtract(r2);
            case '.', 'x', 'X', '*' -> r1.multiply(r2);
            case '/' -> r1.divide(r2);
            default -> new Rational();
        };

        System.out.println(r1 + " " + str[1] + " " + r2 + " = " + ans);


    }

    public static int[] extractRationalNumber(String s) {

        return new int[]{
                Integer.parseInt(String.valueOf(s.charAt(0))),
                Integer.parseInt(String.valueOf(s.charAt(2)))
        };
    }

    public static Rational toRational(int[] s) {
        return new Rational(
                new BigInteger(String.valueOf(s[0])),
                new BigInteger(String.valueOf(s[1]))
        );
    }


}
