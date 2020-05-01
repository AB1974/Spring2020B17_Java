package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll2 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        //add 30,20,40,50,45,35,200

        System.out.println("=====addAll=with Arrays.asList=========");

        list1.addAll(Arrays.asList(30, 20, 40, 50, 45, 35, 200));
        System.out.println(list1);

        System.out.println("==or++");

        Integer[] arr1 = {70, 80, 90};
        list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);

        System.out.println("======================");
        String[] names = {"Muhtar", "Murteza", "Aylin", "Engin", "Arin"};//size can not be change!

        ArrayList<String> nameList = new ArrayList<>();

        nameList.addAll(Arrays.asList(names));
        System.out.println(nameList);

        nameList.add("Osman");
        System.out.println(nameList);
        nameList.remove("Muhtar");
        System.out.println(nameList);
        nameList.add("Arzu");
        System.out.println(nameList);

        System.out.println("===========another way array to arraylist====");

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers));

        System.out.println(numList);


    }
}
