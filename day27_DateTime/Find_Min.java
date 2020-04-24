package day27_DateTime;

import day07_IfStatements.MinNumber;

public class Find_Min {
    /*
    		1. write a return method that can return the minimum number from an int array
		    2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.
     */

    public static void main(String[] args) {

        int[] arr = {5, 4, 7, 5};
        int minimum = arr[0];//just an assumption in order to find which one is minimum we need loop to check every index.

        for (int each : arr) {

            if (each < minimum) {
                minimum = each;
            }
        }
        System.out.println(minimum);//4
        int[] arr2 = {100, 200, 3000, -100, 40, 9000};
        int num = minimum(arr2);
        System.out.println(num);//-100
        double[] arr3 = {100.0, 200.0, 3000.0, 40.0,};
        double num1 = minimum(arr3);
        System.out.println(num1);//40.0
    }

    public static int minimum(int[] arr) {
        int minimum = arr[0];
        for (int each : arr) {

            if (each < minimum) {
                minimum = each;
            }

        }
        return minimum;
    }




    public static double minimum(double[]arr){
        double minimum = arr[0];
        for (double each : arr) {

            if (each < minimum) {
                minimum = each;
            }

        }
        return minimum;
    }

    }



