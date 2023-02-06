import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Ejercicio_13_2_ShuffleArrayList {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2.0);
        list.add(new BigInteger("3000"));
        list.add(new BigDecimal("4.5001"));
        list.add(5);
        list.add(6.6767);
        list.add(new BigInteger("7000"));
        list.add(new BigInteger("800000000"));
        list.add(new BigDecimal("9.5001"));
        list.add(new BigDecimal("10.50000001"));

        System.out.println("Before " + list);

        shuffle(list);

        System.out.println("After " + list);

    }


    public static void shuffle(ArrayList<Number> list) {

        for (int i = list.size() - 1; i >= 0; i--) {
            int randomIndex = (int) (Math.random() * list.size());
            list.add(list.get(randomIndex));
            list.remove(randomIndex);
        }
    }


}
