package OfficeHours.Practice_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    /**
     * 5) Create a method that will accept an ArrayList of Strings
     * and return the String that has the biggest length
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Car", "House", "Java", "practice"));
        System.out.println(longestString(list));

    }

    public static String longestString(ArrayList<String> list) {

        String biggest = "";

        for (String word : list) {

            if (word.length() > biggest.length()) {
                biggest = word;
            }

        }
        return biggest;
    }


}


