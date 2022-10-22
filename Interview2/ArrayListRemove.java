package Interview2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemove {
    public static void main(String[] args) {
        //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 10.

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1, 80, 40, 30, 2, 1, 3, 5));

        list.removeIf(p -> p > 10);
        System.out.println(list);
        System.out.println("=================================================================");

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(-1, 80, 40, 30, 2, 1, 3, 5));
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < 10) {
                list2.add(list.get(i));
            }

        }
        System.out.println(list2);


    }
}