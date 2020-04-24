package PracticeLoopReview;
import java.util.Scanner;
public class GiveMe5Dollars {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int dollars = 0;

        while (dollars != 5) {
            System.out.println("Give me 5 dollars");
            dollars = scan.nextInt();

        }
        System.out.println("Thank you for 5 dollars");
    }



}
