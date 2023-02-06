public class Ejercicio_13_6_ComparableCircle extends Listing_13_2_Circle {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(2);
        ComparableCircle c2 = new ComparableCircle(1.5);
        System.out.println(c1.compareTo(c2));

        Listing_13_9_ComparableRectangle r1 = new Listing_13_9_ComparableRectangle(3, 4);

        Listing_13_1_GeometricObject answer = max(c1, r1);

        System.out.println(answer);


    }

}

class ComparableCircle extends Listing_13_2_Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea();
    }

    @Override
    public boolean equals(Object obj) {
        ComparableCircle circle = (ComparableCircle) obj;
        return circle.getRadius() == getRadius();
    }
}

