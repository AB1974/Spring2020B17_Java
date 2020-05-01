package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveAll4 {
    //write a program remove the duplicates from ArrayLIst
    public static void main(String[] args) {
        System.out.println("========removes all matching object====");
        //Do not use remove method in the loop for now
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        list.removeAll(Arrays.asList(1, 3, 5, 8));
        System.out.println(list);//2,4,6,7

        //write a program remove the duplicates from ArrayLIst(String)
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Aylin", "Engin", "Engin", "Aylin", "Arin"));

        names.removeAll(Arrays.asList("Aylin", "Engin"));
        System.out.println(names);

        System.out.println("====INTERVIEW QUESTIONS====");
        String[] names1 = {"Ahmet", "Ahmet", "Ahmet", "Ahmet", "Ahmet", "Ali", "Ayse"};

        ArrayList<String> names2 = new ArrayList<>(Arrays.asList(names1));
        names2.removeAll(Arrays.asList("Ahmet"));
        System.out.println(names2);





















    }
}
