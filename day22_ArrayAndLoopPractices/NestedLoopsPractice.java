package day22_ArrayAndLoopPractices;

public class NestedLoopsPractice {

    public static void main(String[] args) {


        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}
        };
        //print even numbers same line
        //count the odd numbers and return total odd numbers

        int countOdd = 0;

        for (int j = 0; j < numbers.length; j++) { // j: index num of 1D arrays

            for (int i = 0; i < numbers[j].length; i++) { // i: index num of elements in 1D array
                int num = numbers[j][i];
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                } else {
                    countOdd++;
                }

            }

        }


        System.out.println();

        System.out.println(countOdd);








    }
    }
