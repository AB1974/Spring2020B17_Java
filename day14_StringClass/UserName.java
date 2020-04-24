package day14_StringClass;
import java.util.Scanner;
public class UserName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name:");

        String inputname = scan.nextLine();


        String validname = scan.nextLine();


        if (inputname.equalsIgnoreCase("Max Payne") || validname.equalsIgnoreCase("Alan Wake")) {
            System.out.println("User found!");
        } else {
            System.out.println("User not found!");
        }
    }
}
