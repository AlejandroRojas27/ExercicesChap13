public class Listing_13_4_TestGeometricObject {
    /** Main method */
    public static void main(String[] args) {
        // Create two geometric objects
        Listing_13_1_GeometricObject geoObject1 = new Listing_13_2_Circle(5);
        Listing_13_1_GeometricObject geoObject2 = new Listing_13_3_Rectangle(5,3);

        System.out.println("The two objects have the same area? " +
                equalArea(geoObject1, geoObject2));

        // Display circle
        displayGeometricObject(geoObject1);

        // Display rectangle
        displayGeometricObject(geoObject2);
    }

    /** A method for comparing the areas of two geometric objects */
    public static boolean equalArea(Listing_13_1_GeometricObject object1,
                                    Listing_13_1_GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }

    /** A method for displaying a geometric object */
    public static void  displayGeometricObject(Listing_13_1_GeometricObject object){
        System.out.println(" ");
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
