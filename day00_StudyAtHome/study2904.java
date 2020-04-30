package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class study2904 {

    public static void main(String[] args) {
        Integer[] arr = new Integer[3];
        int[] array = new int[3];
        // int []array2={3,2,8,};
        array[1] = 2;
        array[2] = 8;
        array[0] = 3;
        Arrays.sort(array);

        for (int i = 0; i < 3; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));


        ArrayList<Integer> list = new ArrayList<>();//3,2,8
        list.add(3);//0
        list.add(2);//1
        list.add(8);//2
        //  list.remove(0);
        list.add(1, 5);
        // list.set(0,7);
        // Collections.sort(list);
        System.out.println(list);


        System.out.println("-----------------");
        ArrayList<Integer> list1 = new ArrayList<>();//3,2,8


        for (int i = 5; i <= 10; i++) {
            list1.add(i);
        }
        list1.set(0, 3);
        System.out.println(list1.size());
        // list1.clear();
        System.out.println(list1 + "");
        System.out.println(list1.get(4));

        boolean bool1 = list1.contains(9);
        System.out.println(bool1);

        String a = "3";
        //  Integer a=8;
        //  list1.remove(a);
        // Integer.parseInt(a);
        //int
        Integer.valueOf(a);
        //Integer
        list1.remove(Integer.valueOf(a));
        System.out.println(list1);


    }
}
