package day22_ArrayAndLoopPractices;

public class Nested_ForEach_Practice {

    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3},//these are arrays
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}
        };
        //print even numbers same line
        //count the odd numbers and return total odd numbers

            int countOdd =0;
            int sumofOdd=0;
            int sumofEven=0;
        for (int[] each1DArray : numbers) {


            for (int eachElement : each1DArray) {

                if (eachElement % 2 == 0) {//even numbers

                    System.out.print(eachElement + " ");
                    sumofEven+=eachElement;

                } else {//odd numbers
                 sumofOdd+=eachElement;
                    countOdd++;
                }
            }
        }
        System.out.println();

        System.out.print(countOdd + " \n");
        System.out.println(("sum of odd: " + sumofOdd));
        System.out.println("sum of even: " + sumofEven);

    }
}
