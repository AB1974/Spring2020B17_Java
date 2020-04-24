package day00_StudyAtHome;
import java.util.Scanner;
public class JavaRecapAfterLoop2 {

    public static void main(String[] args) {

        /*
        enter 10 numbers
        find some of 5 numbers
        find maximum and min
         */
        Scanner scan =new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 5; i++) {

            System.out.println(("Enter your number"));

            int num = scan.nextInt();
            sum += num;

        }
        System.out.println("Your number sum is :" + sum);




    }
}
