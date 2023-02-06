import java.util.GregorianCalendar;

public abstract class Listing_13_1_GeometricObject implements Cloneable {
    private String color = "white";
    private boolean filled;
    private java.util.Date dataCreated;

    /**
     * Constructor a default geometric object
     */
    protected Listing_13_1_GeometricObject() {
        dataCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with coor and filled value
     */
    protected Listing_13_1_GeometricObject(String color, boolean filled) {
        dataCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * Return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set a new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean,
     * the getter method is named IsFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set a new filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Get dateCreated
     */
    public java.util.Date getDataCreated() {
        return dataCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dataCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /**
     * Abstract method getArea
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     */
    public abstract double getPerimeter();

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    public static Listing_13_1_GeometricObject max(Listing_13_1_GeometricObject o1, Listing_13_1_GeometricObject o2){
        return (o1.getArea() > o2.getArea() ? o1: o2);
    }

}
