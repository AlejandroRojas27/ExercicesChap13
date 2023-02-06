public class Listing_13_9_ComparableRectangle extends Listing_13_3_Rectangle
        implements Comparable<Listing_13_9_ComparableRectangle> {
    /**
     * Construct a ComparableRectangle with specified properties
     */
    public Listing_13_9_ComparableRectangle(double width, double height) {
        super(width, height);
    }


    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(Listing_13_9_ComparableRectangle o) {
        return Double.compare(getArea(), o.getArea());
    }

    @Override
    public boolean equals(Object obj) {
        Listing_13_9_ComparableRectangle o = (Listing_13_9_ComparableRectangle) obj;
        return getArea() == o.getArea();
    }

    @Override
    public String toString() {
        return "Width: " + getWidth() + " Height: " + getHeight() +
                " Area: " + getArea();
    }

}
