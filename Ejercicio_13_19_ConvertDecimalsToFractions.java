import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio_13_19_ConvertDecimalsToFractions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");

        String str = input.next();

        Rational x = decimalToFraction(str);


        System.out.println(x);


    }

    public static Rational decimalToFraction(String s) {

        String[] split = s.split("\\.");

        Rational integer = integerPart(split[0]);
        Rational decimal = decimalPart(split);




        if(s.contains("-"))
            return integer.add(decimal).multiply(new Rational(new BigInteger("-1")));
        else
            return integer.add(decimal);
    }

    private static Rational integerPart(String s) {
        Rational integerPart = new Rational();
        if (!s.contains("0")) {
            integerPart = new Rational(new BigInteger(String.valueOf(Math.abs(Integer.parseInt(s)))), new BigInteger("1"));
        }
        return integerPart;
    }

    private static Rational decimalPart(String[] s) {

        String denominator = "1";

        for (int i = 0; i < s[1].length(); i++) {
            denominator += "0";
        }

        return new Rational(new BigInteger(s[1]), new BigInteger(denominator));
    }


}
