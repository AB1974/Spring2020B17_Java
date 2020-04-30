package OfficeHours.Practice_04_29_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_Methods {
    /*
        add(),get(),size(),set(),remove(),clear(),indexOf(),lastIndexOf(),
        size is dynamic
        ArrayList has index numbers

        add()inserting
        set()replacing
        remove(int)
        remove(object)
         */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();//it has to be an Integer
        System.out.println(list);
        System.out.println(list.size());//size is zero because we have not add anything yet

        list.add(10);
        list.add(20);//this one added at the end
        System.out.println(list.size());//size is dynamic

        System.out.println(list.size());//size is increasing
        System.out.println(list);
        list.add(2, 30);//30 will be inserted, other elements move to the next index
        System.out.println(list);
        Integer i1 = list.get(2);
        System.out.println(i1);
        System.out.println("========================");
        int num1 = list.get(2);  // Integer 20,  unboxing

        byte a = 100;
        //  Integer b = a;

        Byte a2 = 100;
        int b2 = a2;  // unboxing
        System.out.println("========================");
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        //{A,B,C,D}
        //{A,B,E,C,D}
        list2.add(2, "E");

        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {

            String str = list2.get(i);
            System.out.println(str);// System.out.println(list2.get(i));

        }
        System.out.println(list2);
        System.out.println("==================");
        for (String each : list2) {

            System.out.println(each);//each element

            // list2={A,B,E,C,D},replace C with F

        }
        list2.set(3, "F");//you need to set index no of the original element,place element you wants to replace

        System.out.println(list2);

        //remove F

        list2.remove(3);
        System.out.println(list2);


        boolean r1 = list2.remove("A");

        System.out.println(r1);//true

        boolean r2=list2.remove("Z");
        System.out.println(r2);//false

        System.out.println(list2.size());
        list2.clear();
        System.out.println(list2.size());
        System.out.println(list2);


    }
}
