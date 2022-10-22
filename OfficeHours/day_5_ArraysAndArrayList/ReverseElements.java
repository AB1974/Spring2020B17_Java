package OfficeHours.day_5_ArraysAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseElements {

    /*
    3) Create a method that will accept an int array and
     reverse the order of elements. Return the reversed array.
    */

    public static void main(String[] args) {
        int a [] = {5,2,8,1,3,9};
        System.out.println(Arrays.toString(reverse(a)));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,12,7,4,15,5));
        System.out.println(reverse(list));
    }


    public static int [] reverse(int [] arr) {

        // 1, 2 ,3, 4 -> 4, 3, 2, 1
        // 4, 2, 3, 1
        // 4, 3, 2, 1

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }

        return arr;
    }

    /*
    4) Overload the method to accept an ArrayList of
    integers and reverse the order of the elements.
     Return the reversed ArrayList
     */

//    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
//        // 5,2,8,1,3,9
//        ArrayList<Integer> rev = new ArrayList<>();
//
//        for(int i= list.size()-1; i >=0; i--) {
//
//            rev.add(list.get(i));
//
//        }
//        return rev;
//
//    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {

        for(int i=0; i < list.size()/2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }

        return list;

    }





}
