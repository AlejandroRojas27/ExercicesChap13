public class Ejercicio_13_11_TheOctagonClass {
    public static void main(String[] args) {

        Octagon octagon = new Octagon(5);
        System.out.println(octagon.getArea());

        Octagon octagon1 = (Octagon) octagon.clone();

        System.out.println(octagon.compareTo(octagon1));

    }
}

class Octagon extends Listing_13_1_GeometricObject implements Comparable<Octagon>, Cloneable{

    private double side;

    public Octagon(){
        this(1);
    }

    public Octagon(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return ( 2 + (4 / Math.sqrt(2))) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}
