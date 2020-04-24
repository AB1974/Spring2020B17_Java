package day00_StudyAtHome;

import java.util.Scanner;

public class FindMaxAndMin {
    public static void main(String[] args) {

        //Ask user 3 times.finding the max and min number!
        Scanner input = new Scanner(System.in);
        int max = -2147483648;
        int min = 2147483647;

        int i = 1;
        while (i <= 3) {

            System.out.println("Enter a number ");

            int num = input.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            i++;
        }
        System.out.println("Max num is " + max);
        System.out.println("Min num is " + min);




    }
}
