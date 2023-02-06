public abstract class GeometricObject implements Cloneable, Comparable<GeometricObject> {
    private String color = "white";
    private boolean filled;
    private java.util.Date dataCreated;

    /**
     * Constructor a default geometric object
     */
    protected GeometricObject() {
        dataCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with coor and filled value
     */
    protected GeometricObject(String color, boolean filled) {
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

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(getArea(), o.getArea());
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return (o1.compareTo(o2) == 1 ? o1 : o2);
    }

}