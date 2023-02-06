import java.util.Scanner;

public class Ejercicio_13_20_AlgebraSolveQuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");

        //Valores
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //Compute area
        double discriminant = b * b - 4 * a * c;
        double root1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
        double root2 = ((-b - Math.sqrt(discriminant)) / (2 * a));

        //Resultados


        //If..
        if ((discriminant) > 0) {
            System.out.println("The roots are: " + (int) (root1 * 1000000) / 1000000.0
                    + " and " + (int) (root2 * 1000000) / 1000000.0);
        }
        else if ((discriminant) == 0){
            System.out.println("The root is: " + root1);
        }
        else{
            double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / 2 * a;
            Complex rootComplex1 = new Complex(-b / (2*a) , imaginaryPart);
            Complex rootComplex2 = new Complex(-b / (2*a), -imaginaryPart);
            System.out.println("The roots are: " + rootComplex1 + " amd " + rootComplex2);

        }



    }
}
