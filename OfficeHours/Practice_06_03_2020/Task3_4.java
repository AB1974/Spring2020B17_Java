package OfficeHours.Practice_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3_4 {

    /**
     * 3) Create a method that will accept an
     * int array and reverse the order of elements. Return the reversed array.
     * 4) Overload the method to accept an ArrayList of integers
     * and reverse the order of the elements. Return the reversed ArrayList
     */

    public static int[] reversea(int[] arr) {
        int[] reversed = new int[arr.length];


        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[i] = arr[arr.length - 1-i];

        }
        return reversed;
    }
//Overload
    public static ArrayList<Integer> reversea(ArrayList<Integer> list) {

        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));

        }

        return reversed;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};

        System.out.println(Arrays.toString(reversea(arr1)));//4,3,2,1

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(reversea(list3));
    }

}