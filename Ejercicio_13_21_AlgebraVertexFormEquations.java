import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio_13_21_AlgebraVertexFormEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");

        //Valores
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        String hDecimal = String.valueOf(-b / (2.0 * a));
        String kDecimal = String.valueOf(( (4.0 * a * c) - Math.pow(b,2.0)) / (4.0 * a));

        Rational h;
        Rational k;

        if(!hDecimal.contains(".")){
            h = new Rational(new BigInteger(hDecimal));
        }else {
            h = Ejercicio_13_19_ConvertDecimalsToFractions.decimalToFraction(hDecimal);
        }

        if(!kDecimal.contains(".")){
            k = new Rational(new BigInteger(kDecimal));
        }else {
            k = Ejercicio_13_19_ConvertDecimalsToFractions.decimalToFraction(kDecimal);
        }

        System.out.println("h is " + h + " k is " + k);



    }
}
