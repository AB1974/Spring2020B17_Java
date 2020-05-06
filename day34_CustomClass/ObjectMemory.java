package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {

    int a = 300;

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        ArrayList<Integer> list2 = list1;
        list1.remove(2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("============");

        String str1 = new String("Cybertek");

        String str2 = str1;
        str1 = str1.toUpperCase();
        System.out.println(str1);
        System.out.println(str2);
        int a = 100;
        System.out.println(a);


    }
}
