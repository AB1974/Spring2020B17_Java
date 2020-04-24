package day17_WhileDoWhileLoop;
import java.util.Scanner;
public class MaxMinNumberLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int MaxNumber = -2147483647;  // any number the user provided will be greater than this number
        // first user entered variable will be initalized to MaxNumber
        //MaxNumber = 5;

        int MinNumber = 2147483647;
        // MinNumber = 0;

        for(int i =1; i <= 10; i++) { // i: 1, 2, 3,4,5

            System.out.println("Enter a number");
            int num = input.nextInt();  // 0, 5, 1, 3, 0

            if(num > MaxNumber){  // to compare each user inputs , and assign the maximum number to MaxNumber
                MaxNumber = num;
            }

            if(num < MinNumber){ // to compare each user inputs , and assign the minimum number to MinNumber
                MinNumber = num;
            }
        }

        System.out.println("Maximum Number: "+MaxNumber);
        System.out.println("Minimum Number: "+MinNumber);



    }
}
