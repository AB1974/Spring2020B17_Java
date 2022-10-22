package OfficeHours.Practice_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1_2 {
    /**
     * 1) Create a method that will accept an int array
     * and return the sum of all the numbers in the given array
     * 2) Overload the method to accept an ArrayList
     * of integers and return the sum of all the numbers in the given ArrayList
     */

    public static int sumOf(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++)

            sum += arr[i];
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 8};
        System.out.println(sumOf(arr));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7, 8));
        sumOf(list);
        System.out.println((sumOf(list)));

    }
//Overload
    public static int sumOf(ArrayList<Integer> list) {

        int sum = 0;
        for (int i = 0; i < list.size(); i++)

            sum += list.get(i);

        return sum;

    }


}