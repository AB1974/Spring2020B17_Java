package MixedEveryting;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    /**
     * 1) Create a method that will accept an int array
     * and return the sum of all the numbers(int) in the given array
     * 2) Overload the method to accept an ArrayList
     * of integers and return the sum of all the numbers in the given ArrayList
     */

    public static int sumAll(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }
        return sum;

    }

    public static int sumAll(ArrayList<Integer> list) {

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);

        }
        return sum;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 7, 8};
        System.out.println(sumAll(arr));

        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 7, 8));

        System.out.println(sumAll(list1));

    }

}
