import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio_13_15_UseBigIntegerForTheRationalClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first rational number: ");
        Rational r1 = new Rational(new BigInteger(input.next()), new BigInteger(input.next()));


        System.out.print("Enter the second rational number: ");
        Rational r2 = new Rational(new BigInteger(input.next()), new BigInteger(input.next()));

        Rational r3 = r1.add(r2);
        Rational r4 = r1.subtract(r2);
        Rational r5 = r1.multiply(r2);
        Rational r6 = r1.divide(r2);

        System.out.println(r1 + " + " + r2 + " = " + r3);
        System.out.println(r1 + " - " + r2 + " = " + r4);
        System.out.println(r1 + " . " + r2 + " = " + r5);
        System.out.println(r1 + " / " + r2 + " = " + r6);
        System.out.println(r1 + " is " + r1.doubleValue());
        System.out.println(r2 + " is " + r2.doubleValue());
        System.out.println(r1.compareTo(r2));

        /*


        System.out.println("------- TEST OPERATIONS -------");

        System.out.println(r3.getNumerator() + " / " + r3.getDenominator());
        System.out.println(r4.getNumerator() + " / " + r4.getDenominator());
        System.out.println(r5.getNumerator() + " / " + r5.getDenominator());
        System.out.println(r6.getNumerator() + " / " + r6.getDenominator());

        System.out.println("------- TEST toString METHOD -------");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("------- TEST equals METHOD -------");
        System.out.println(r1.equals(r4));
        System.out.println(r2.equals(r4));

         */


    }
}





