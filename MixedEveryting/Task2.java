package MixedEveryting;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    /**
     * 3) Create a method that will accept an
     * int array and reverse the order of elements. Return the reversed array.
     * 4) Overload the method to accept an ArrayList of integers
     * and reverse the order of the elements. Return the reversed ArrayList
     */


    public static int[] reversed(int[] array) {

        int[] reversed = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[i] = array[array.length - 1 - i];

        }
        return reversed;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> list) {

        ArrayList<Integer> reverse = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            reverse.add(list.get(i));

        }
        return reverse;
    }


    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(reversed(array)));
        System.out.println("===============");

        ArrayList<Integer> reversedList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(reversed(reversedList));
    }


}
