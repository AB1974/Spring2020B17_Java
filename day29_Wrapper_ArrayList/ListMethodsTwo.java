package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class ListMethodsTwo {
    /*
        create a list of Integers
        add 5 Integers to it
        return the max num from the list
         */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();//size is 5

        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        list.add(800);

        int maximum = Integer.MIN_VALUE;//just an assumption

        // int maximum=list.get(0);another way

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > maximum) {
                maximum = list.get(i);


            }
        }
        System.out.println(maximum);

        System.out.println("============");

        int maximum2 = Integer.MIN_VALUE;//just an assumption

        for (Integer each : list) {

            if (each > maximum2) {
                maximum2 = each;
            }
        }
        System.out.println(maximum2);
        System.out.println("=================");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(5000);

        int maximum3 = max(list2);//calling method in below.
        System.out.println(maximum3);
        System.out.println("==============");
    }

    public static int max(ArrayList<Integer> list) {//Returns max Integer from a an Array List
        int maximum = Integer.MIN_VALUE;//just an assumption
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) > maximum) {
                maximum = list.get(i);


            }
        }
        return maximum;
    }


}
