package day22_ArrayAndLoopPractices;

import java.util.Arrays;

public class EvenNumbers {

    public static void main(String[] args) {
        /*
            1. create an int array called numbers that has length of 100.
            2. assign 1~100 to the array' each indexes
            3. use for each loop to print out all the even numbers.
                MUst use continue statement
         */

        int[] numbers = new int[100];//this array has length of 100.//index no 0~99//
/*
        numbers[0]=1;
        numbers[1]=2;
        //.....
        numbers[99]=100;
*/


        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1;//we are assigning 1 to 100
        }
        System.out.println(Arrays.toString(numbers));


        for (int each : numbers) {

            if (each % 2 != 0) {
                continue;
            }

                System.out.print(each + ", ");
            }


        }
    }

