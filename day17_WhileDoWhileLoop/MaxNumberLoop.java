package day17_WhileDoWhileLoop;
import java.util.Scanner;
public class MaxNumberLoop {

    public static void main(String[] args) {
        /*

    1. write a program that can ask the user "enter a number" five times and return the maximum number
                hint: you will need for loop and if statement
         */
        Scanner scan=new Scanner(System.in);

        int MaxNUm=-999999999;
        for(int i=1;i<=5;i++) {

            System.out.println("Enter a number:");
            int userNum = scan.nextInt();

            if(userNum>MaxNUm){

                MaxNUm=userNum;
            }
        }
        System.out.println("Maximum number is : "+MaxNUm);
    }
}
