public class Listing_13_2_Circle extends Listing_13_1_GeometricObject {
    private double radius;

    public Listing_13_2_Circle() {
    }

    public Listing_13_2_Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return diameter
     */
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    /** Return Perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Print the circle info
     */
    public void printCircle() {
        System.out.println("The circle is created " + getDataCreated() +
                " and the radius is " + radius);
    }

    @Override
    /** Return a string representation of a Circle object */
    public String toString() {
        return super.toString() + " radius: " + radius;
    }
}
