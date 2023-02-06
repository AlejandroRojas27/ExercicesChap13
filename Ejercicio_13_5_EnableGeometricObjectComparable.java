public class Ejercicio_13_5_EnableGeometricObjectComparable {
    public static void main(String[] args) {

        GeometricObject geometricObject1 = new Circle(3);
        GeometricObject geometricObject2 = new Circle(2);
        GeometricObject geometricObject3 = GeometricObject.max(geometricObject1, geometricObject2);
        System.out.println(geometricObject3);

        GeometricObject geometricObject4 = new Rectangle(5, 6);
        GeometricObject geometricObject5 = new Rectangle(6, 6);
        GeometricObject geometricObject6 = GeometricObject.max(geometricObject4, geometricObject5);

        System.out.println(geometricObject6);

    }

}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
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
        return "Name: Circle\n" + super.toString() + " radius: " + radius + "\nArea: " + getArea();
    }

}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width * height);
    }

    @Override
    public String toString() {
        return "Name: Rectangle\n"
                + super.toString() + " width: " + width + " height: " + height +
                "\nArea: " + getArea();
    }
}




