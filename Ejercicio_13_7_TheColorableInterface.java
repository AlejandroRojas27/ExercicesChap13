public class Ejercicio_13_7_TheColorableInterface {
    public static void main(String[] args) {
        GeometricObject[] geometricObjects = {
                new Rectangle(3, 4),
                new Circle(2.5),
                new Square(4),
                new Square(5),
                new Rectangle(6, 2),
                new Circle(4),
        };

        for (int i = 0; i < geometricObjects.length; i++) {
            System.out.println("------- " + "Geometric object No. " + i + " -------");
            System.out.println(geometricObjects[i]);

            if(geometricObjects[i] instanceof Colorable){
                ((Colorable)geometricObjects[i]).howToColor();
            }
        }

    }
}

class Square extends GeometricObject implements Colorable {

    private double side;

    public Square() {
        this(0);
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Name: Square\n" + super.toString() + "\nSide: " + getSide()  + " Area: " + getArea();
    }
}