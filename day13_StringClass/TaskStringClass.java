package day13_StringClass;
import java.sql.ResultSet;
import java.util.Scanner;
public class TaskStringClass {

    public static void main(String[] args) {
        /*
        write me a program that asks the user first name and last names.prints the initials
        input:
        cybertek
        school
        output:
        CS
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name ");

        String firstName = scan.nextLine();

        System.out.println("Enter your last name ");

        String lastName = scan.nextLine();


        firstName = firstName.substring(0, 1);

        lastName = lastName.substring(0, 1);


        System.out.println(firstName.toUpperCase() + lastName.toUpperCase());
        scan.nextLine();


    }
}