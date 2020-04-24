package day17_WhileDoWhileLoop;
import java.util.Scanner;
public class MinNumberLoop {

    public static void main(String[] args) {
        /*
         write a program that can ask the user "enter a number" five times and return the minimum number
		 hint: you will need for loop and if statement
         */
        Scanner input = new Scanner(System.in);
        int MinNumber = 1999999999;  // any number the user provided will be greater than this number
        // first user entered variable will be initalized to MaxNumber
        //MaxNumber = 5;

        for(int i =1; i <= 5; i++) { // i: 1, 2, 3,4,5
            System.out.println("Enter a number");
            int num = input.nextInt();  // 0, 5, 1, 3, 0

            if(num < MinNumber){  // to compare each user inputs , and assign the maximum number to MaxNumber
                MinNumber = num;
            }

        }


        System.out.println("Your min number is : "+MinNumber);

    }

}
