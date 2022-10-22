package day52_CollectionFramework_Intro;

import java.util.*;

public class Collections_Utility {
    //Collections is utility class
    //Collection is Interface (check the table from day52)

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4));
        Collections.sort(list1);//4,5,6,7,8,9,10
        System.out.println(list1);

        System.out.println("===================================");
        //     1. write a program that can REMOVE the duplicates for arraylist and print out in sorted ASCENDING order

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(100, 2000, 50, 50, 100, 200, 300, 50));
        //1,2,3,4,5,6,7
        nums = new ArrayList<>(new TreeSet<>(nums));

        System.out.println(nums);

        System.out.println("====================================");
        // 2. write a program that can removed the duplicates from an arraylist. DO NOT change the order
        //   [6,6,6,6,5,5,5,4,4,4,4] ==> [6,5,4]

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 4));
        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println(list);


        System.out.println("==================================================");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("A", "B", "C", "B", "D"));

        boolean result = Collections.frequency(letters, "A") == 1;

        System.out.println(result);


    }

}