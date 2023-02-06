import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio_13_3_SortArrayList {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        /*
        list.add(1000);
        list.add(2.0);
        list.add(new BigInteger("3000"));
        list.add(new BigDecimal("4.5001"));

         */
        list.add(9);
        list.add(1);
        list.add(8);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(6);
        list.add(4);
        list.add(5);

        System.out.println("Before " + list);

        sort(list);

        System.out.println("After " + list);

    }

    /*
    public static void sort(ArrayList<Number> list){

        ArrayList<BigDecimal> bigDecimalArrayList = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            String temp = String.valueOf(list.get(i));
            BigDecimal num = new BigDecimal(temp);
            //System.out.println(temp + " " + num);
            bigDecimalArrayList.add(num);

        }

        Collections.sort(bigDecimalArrayList);

        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
            list.add(i,bigDecimalArrayList.get(i));
        }




    }

     */

    public static void sort(ArrayList<Number> list) {

        for (int j = 0; j < list.size() - 1; j++) {

            for (int i = 0; i < list.size() - 1; i++) {

                int index = i;

                BigDecimal min = new BigDecimal(String.valueOf(list.get(index)));
                BigDecimal next = new BigDecimal(String.valueOf(list.get(index + 1)));

                if (next.compareTo(min) == -1) {
                    list.add(index + 1, min);
                    list.remove(index);

                    list.remove(index + 1);
                    list.add(index, next);
                }


            }

        }

    }


}
