import java.util.ArrayList;

public class CheckPointQuestionsCHAP13 {
    public static void main(String[] args) {


        //13.3.1
        /*
        Number numberRef = Integer.valueOf(0);
        Double doubleRef = (Double) numberRef;

         */

        Number numberRef = Integer.valueOf(0);
        Double doubleRef = numberRef.doubleValue();

        //13.3.2
        Number[] numberArray = new Number[2];
        numberArray[0] = Double.valueOf(1.5);
        /*

        Number[] numberArray = Integer[2];
        numberArray[0] = Double.valueOf(1.5);

         */

        //13.3.3
        Number x = 3;
        System.out.println(x.intValue()); //Display 3
        System.out.println(x.doubleValue()); //Display 3.0

        //13.3.4
        Integer x1 = Integer.valueOf(3);
        System.out.println(x1.intValue()); // Display 3
        System.out.println(x1.compareTo(4)); // Display -1

        //13.5.4
        //Wrong
        /*

        interface A {
void m1();
}
class B implements A {
void m1() {
System.out.println("m1");
}
}

         */

        //Correct
        /*

        interface A {
void m1();
}
abstract class B implements A {
@Override
public void m1() {
System.out.println("m1");
}
}

         */

        //TESTING compareTo

        System.out.println(Integer.valueOf(3).compareTo(5));
        System.out.println("ABC".compareTo("ABC"));
        java.util.Date date1 = new java.util.Date(2013, 1, 1);
        java.util.Date date2 = new java.util.Date(2012, 1, 1);
        System.out.println(date1.compareTo(date2));

        //13.6.3
        Integer n1 = 3;
        Object n2 = 4;
        //System.out.print(n1.compareTo( n2)); This not compile because Object its not be able to use
        // compareTo

        // //13.6.5
        // Wrong
        /*

        public class Test {
public static void main(String[] args) {
Person[] persons = {new Person(3), new Person(4), new Person(1)};
java.util.Arrays.sort(persons);
}
}
class Person {
private int id;
Person(int id) {
this.id = id;
}
}
         */

        // Correct
        /*

        public class Test {
    public static void main(String[] args) {

       Person[] persons = {
               new Person(3),
               new Person(4),
               new Person(1)};
       java.util.Arrays.sort(persons);

        for (Person p: persons) {
            System.out.println("Person id: " + p.getId());
        }


    }
}

class Person implements Comparable<Person> {
    private int id;

    Person(int id){
        this.id = id;
    }

    @Override
    public int compareTo(Person o) {
        if(id > o.id)
            return 1;
        else if (id < o.id)
            return  -1;
        else
            return  0;
    }

    public int getId() {
        return id;
    }
}

         */


        //13.7.3

        java.util.Date date = new java.util.Date();
        java.util.Date date173 = date;
        java.util.Date date273 = (java.util.Date)(date.clone());

        System.out.println(date == date173);  //Display true
        System.out.println(date == date273);  //Display false
        System.out.println(date.equals(date273));  //Display true

        //13.7.4

        ArrayList<String> list = new ArrayList<>();
        list.add("New York");
        ArrayList<String> list1 = list;
        ArrayList<String> list2 = (ArrayList<String>) (list.clone());
        list.add("Atlanta");
        System.out.println(list == list1); //Display true
        System.out.println(list == list2);  //Display false
        System.out.println("list is" + list);  //Display list is[New York, Atlanta]
        System.out.println("list1 is" + list1);  //Display list1 is[New York, Atlanta]
        System.out.println("list2.get[0] is " + list2.get(0));  //Display list2.get[0] is New York
        System.out.println("list2.size() is " + list2.size());  //Display list2.size() is 1

        //13.7.5
        Listing_13_1_GeometricObject xCircle = new Listing_13_2_Circle(3);
        Listing_13_1_GeometricObject yCircle = (Listing_13_1_GeometricObject) (xCircle.clone());
        //AND IMPLEMENT clone in Listing_13_1_GeometricObject
        /*
        @Override
    public Object clone(){
        try {
            return  super.clone();
        }
        catch (CloneNotSupportedException ex){
            return null;
        }
    }
         */

        //13.7.6

        Listing_13_11_House house1 = new Listing_13_11_House(1, 1750.50);
        Listing_13_11_House house2 = (Listing_13_11_House)house1.clone();
        System.out.println(house1.equals(house2));

        //13.9.1
        Listing_13_13_Rational r1 = new Listing_13_13_Rational(-2, 6);
        System.out.println(r1.getNumerator());      //Display -1
        System.out.println(r1.getDenominator());    //Display 3
        System.out.println(r1.intValue());          //Display 0
        System.out.println(r1.doubleValue());       //Display -0.3333333333333333

        //13.9.2
        Object r2 = new Listing_13_13_Rational(1, 45);
        System.out.println(((Listing_13_13_Rational) r2).compareTo(r1)); // Display 1

        //13.9.3
        Object r3 = new Listing_13_13_Rational(-2, 6);
        Listing_13_13_Rational r4 = new Listing_13_13_Rational(1, 45);
        System.out.println(r4.compareTo((Listing_13_13_Rational) r3)); // Display 1

        //13.9.5
        Listing_13_13_Rational r5 = new Listing_13_13_Rational(1,2);
        Listing_13_13_Rational r6 = new Listing_13_13_Rational(1,-2);
        System.out.println(r5.add(r6)); // Display 0/4

        //13.9.6 After the error in toString was fixed, displays 0




    }
}
