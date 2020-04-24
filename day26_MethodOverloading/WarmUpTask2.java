package day26_MethodOverloading;
/*
    5. write an int[] return method that can sort an int array in descending order
	6. write a double[] return method that can sort a double array in descending order
	7. write a char[] return method that can sort a char array in descending order
			NOTE: MUST apply method overloading
 */

import java.util.Arrays;

public class WarmUpTask2 {

    public static void main(String[] args) {
        double[] arr3 = {2.4, 4.5, 6.7, 90.8};
        double[] num = descending(arr3);
        System.out.println(Arrays.toString(num));

        int[] arr4 = {1, 2, 3, 4, 5};
        int[] num1 = descending(arr4);
        System.out.println(Arrays.toString(num1));

        char[] ch = {'A', 'B', 'C', 'D'};
        char[] ch2 = descending(ch);
        System.out.println(Arrays.toString(ch2));

    }

    public static double[] descending(double[] arr) {
        Arrays.sort(arr);
        double[] descending = new double[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            descending[j] = arr[i];
            j++;
        }
        return descending;

    }

    public static int[] descending(int[] arr) {

        int[] descending = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            descending[j] = arr[i];
            j++;

        }
        return descending;
    }

    public static char[] descending(char[] ch) {
        Arrays.sort(ch);
        char[] descending = new char[ch.length];
        int j = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            descending[j] = ch[i];
            j++;
        }

        return descending;
    }

    }






















