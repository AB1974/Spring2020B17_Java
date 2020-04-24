package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

//write a return method that can return second maximum number from an int array
//if any method we call from class name it means %100 static!
public class ReturnMethod2 {

    public static void main(String[] args) {

        int[] arr = {100, 40, 500, 50, 30, 100, -5, -100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//ascending orders
        int lastIndexNum = arr.length - 1;//arr.length-2;
        int secondLastIndexNum = lastIndexNum - 1;

        int secondMaximum = arr[arr.length - 2];

        System.out.println(secondMaximum);


        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};

        int num = SecondMax(arr2);//pass the array name only !

        System.out.println(num);
    }


    public static int SecondMax(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//ascending orders
        int lastIndexNum = arr.length - 1;//arr.length-2;
        int secondLastIndexNum = lastIndexNum - 1;

        int secondMaximum = arr[arr.length - 2];

        return secondMaximum;//this is last line whatever you write after that will not be executed!

    }


}
