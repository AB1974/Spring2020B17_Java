package Interview2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSort {

    public static void main(String[] args) {

//public static void SortingArrayListDesc(List<Integer> list) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(17, -2, 30, 14, 5));


        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

}

