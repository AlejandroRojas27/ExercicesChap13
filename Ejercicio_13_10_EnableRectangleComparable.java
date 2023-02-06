public class Ejercicio_13_10_EnableRectangleComparable {
    public static void main(String[] args) {

        ComparableRectangle r1 = new ComparableRectangle(3,4);
        ComparableRectangle r2 = new ComparableRectangle(4,3);
        System.out.println(r1.equals(r2));

    }
}

class ComparableRectangle extends Listing_13_3_Rectangle implements Comparable<ComparableRectangle>{

    public ComparableRectangle(double width, double height){
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override
    public boolean equals(Object obj) {
        ComparableRectangle rectangle = (ComparableRectangle) obj;
        return getArea() == rectangle.getArea();
    }
}
