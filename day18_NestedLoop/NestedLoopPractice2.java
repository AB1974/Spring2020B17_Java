package day18_NestedLoop;
import java.util.Scanner;
public class NestedLoopPractice2 {
    public static void main(String[] args) {


        /*
        Write me a program
         */

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers:");

            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println("Addition of two numbers;" + (num1 + num2));
            System.out.println("Do you want to continue?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {//we want to repeat it .

                System.out.println("Invalid entry! Please re-enter,yes or no ");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")) {

                System.out.println("Thank you for using calculator!");
                break;
            }


        }

    }
}
