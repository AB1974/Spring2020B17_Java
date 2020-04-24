package PracticeLoopReviewThree;
import java.util.Scanner;
public class DoWhileTask {
/*
Ask user to enter 2 ints:
-if sum of those ints is not more than 100,then keep asking for 2 numbers / condition
-once sum of those 2 numbers is more than 100 then Print "Good Numbers" Program Ends
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        do {

            System.out.println("Enter 2 number");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            sum += num1 + num2;

        } while (sum <= 100);//if its true keep asking! if its false exit the loop by printing below statement
        System.out.println("Good numbers");

    }
}
