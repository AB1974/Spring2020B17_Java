package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {

    public static void main(String[] args) {
        /*
        write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]

         */
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();//we will store them in duplicate

        //list.get()==>"A"//    count>0 means duplicated


        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (String each : list) {
                if (each.equals( list.get(i) )) {
                    count++;
                }
            }
            if (count > 1 && !duplicates.contains( list.get(i) )) {//if we want to character only once to be printed

                duplicates.add( list.get(i) );//we store duplicates

            }
        }
        System.out.println(duplicates);


    }

}
