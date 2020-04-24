package day26_MethodOverloading;

import java.util.Arrays;

public class WarmUpTask {
    /*
	1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading
	3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading
	5. write an int[] return method that can sort an int array in descending order
	6. write a double[] return method that can sort a double array in descending order
	7. write a char[] return method that can sort a char array in descending order
			NOTE: MUST apply method overloading
     */

    public static void main(String[] args) {

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        double[] arr3 = {2.4, 4.5, 6.7, 90.8};

        int arr = MaxNUm(arr2);
        System.out.println(arr);

        double arr4 = MaxNUm(arr3);
        System.out.println(arr4);

        int arrr = MinNUm(arr2);
        System.out.println(arrr);

        double arr5 = MinNUm(arr3);
        System.out.println(arr5);


    }

    public static int MaxNUm(int[] arr) {

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        System.out.println(max);
        return max;
    }

    public static double MaxNUm(double[] arr) {
        Arrays.sort(arr);
        double max = arr[arr.length - 1];
        System.out.println(max);
        return max;
    }

    public static int MinNUm(int[] arr) {

        Arrays.sort(arr);
        int min = arr[0];
        System.out.println(min);
        return min;
    }

    public static double MinNUm(double[] arr) {
        Arrays.sort(arr);
        double min = arr[0];
        System.out.println(min);
        return min;
    }


    }


