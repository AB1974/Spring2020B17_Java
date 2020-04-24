package day15_ForLoop;

public class ForLoopPractie {

    public static void main(String[] args) {
        /*
        1. Write a program that displays each odd (1,3,5)number in popup between 1 and 100 single line separated by space
         */


        for (int oddNum = 1; oddNum <= 101; oddNum += 2) {

            System.out.print(oddNum + " ");
        }

        System.out.println("=======================");

        for (int evenNum = 0; evenNum <= 100; evenNum += 2) {

            System.out.print(evenNum + " ");
        }



    }
}
