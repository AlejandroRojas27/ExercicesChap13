public class Ejercicio_13_12_SumTheAreasOfGeometricObjects {
    public static void main(String[] args) {

        GeometricObject[] geometricObjects = {
                new Circle(5),
                new Circle(5),
                new Rectangle(2,5),
                new Rectangle(2,5)
        };

        System.out.println("Sum of all geometric objects: " + sumArea(geometricObjects));
    }

    public static double sumArea(GeometricObject[] a){

        double sumArea = 0;

        for (int i = 0; i < a.length; i++) {
            sumArea += a[i].getArea();
            System.out.println(a[i].getArea());
        }

        return sumArea;
    }
}
