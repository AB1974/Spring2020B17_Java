package day31_BulkOperations;

import java.util.*;

public class ArrayList_Methods1 {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A","B","C","D"));
        System.out.println(list1);

        boolean r1 = list1.contains("C");
        System.out.println(r1);
        System.out.println("==============");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        boolean r2 = list1.equals(list2);
        System.out.println(r2);

        System.out.println("============");
        Collections.sort(list1); // list1: {A, B, C, D};
        Collections.sort(list2); // list2: {A. B, C, D};


        boolean r5 = list1.equals(list2);
        System.out.println(r5); // false

        System.out.println("==============");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r3 = arr1.equals(arr2);
        System.out.println(r3);
        System.out.println("=============");

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r4 = Arrays.equals(arr1, arr2);
        System.out.println(r4);

        System.out.println("=======GUZEL BIR ORNEK REVERSED ARRAY LIST========");


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);
        //expected 1000,100,20,10

        Collections.sort(list3);
        System.out.println(list3);

        ArrayList<Integer> reversedList3 = new ArrayList<>();
        for (int i = list3.size() - 1; i >= 0; i--) {//we can retrieve each element with get (); method

            reversedList3.add(list3.get(i)); //System.out.print(list3.get(i) + " ");

        }
        System.out.println(reversedList3);
        list3 = reversedList3;//1000,100,20,10
        System.out.println(list3);
        System.out.println(list3.size());
        boolean bool = list3.isEmpty();
        System.out.println(bool);//list is full//returns false
        list3.clear();
        System.out.println(list3.isEmpty());//true

    }
}
