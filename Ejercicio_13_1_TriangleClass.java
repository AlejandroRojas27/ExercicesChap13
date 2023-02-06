import java.util.Scanner;

public class Ejercicio_13_1_TriangleClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triangle triangle = new Triangle(6,8,10);
        System.out.print("Prompt a color for the triangle: ");
        triangle.setColor(input.nextLine());
        System.out.print("The triangle is filled? ");
        triangle.setFilled(input.nextBoolean());

        System.out.println(triangle);

    }
}

class Triangle extends Listing_13_1_GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        this(3.0,4.0,5.0);
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.pow((s - side1) * (s - side2) * (s - side3) * s, 0.5);
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return super.toString() + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }
}
