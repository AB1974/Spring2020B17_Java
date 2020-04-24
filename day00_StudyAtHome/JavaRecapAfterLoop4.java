package day00_StudyAtHome;
import java.util.Scanner;
public class JavaRecapAfterLoop4 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);


        int min = 999999999;
        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter your number:");
            int MinNum = scan.nextInt();
            if (MinNum < min) {
               min=MinNum;
            }

        }

        System.out.println("Your min value is :"+min);

    }
}
