package day20_Arrays02;
import java.util.Scanner;
public class MonthsTask {

    public static void main(String[] args) {
        //Task: Create an array that holds 12 months names
        // User should be able to enter month index and output should be:"The month name is <MonthName>"

        String[] Months = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oc", "Nov", "Dec"};
            //                            size is 12 index no 11
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = scan.nextInt();

        int attemts = 1;

        while (num > 12 || num <= 0) {
            System.out.println("invalid entry");
            System.out.println("Please re-enter number");
            num = scan.nextInt();
            attemts++;

            if (attemts == 3 && (num > 12 || num <= 0)) {
                System.out.println("Invalid entry you already have 3 attempts");
                System.exit(0);
            }
        }

        String result = Months[num - 1];//index number, index number starts for 0 always.

        System.out.println(result);


    }

}


