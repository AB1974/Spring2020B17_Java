package day21_MultiDimensionalArray;

public class AverageNumber {

    public static void main(String[] args) {
/*
	1. write a program that can return the average number from an array of integers
			ex:
				[4, 5, 6, 7, 8, 10, 20, 30, 0]average: 10
 */
        int[] array = {10, 20, 30, 40, 50,60,70,50,40,25};

        int length = array.length / 5;// total number of the element

        //average number


        int sum = 0;

        for (int i = 0; i <= array.length - 1; i++) {

            sum += array[i];
        }

        System.out.println("The average of the numbers: "+sum / array.length);












    }
}
