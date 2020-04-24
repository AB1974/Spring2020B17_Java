package day13_StringClass;

import java.util.Scanner;

public class TaskStringClassChar {
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

        char ch1 = firstName.charAt(0);
        String heb = ("" + ch1).toUpperCase();//char i String e baglayabilirsin bu sekilde
        char ch2 = lastName.charAt(0);
        String ab = ("" + ch2).toUpperCase();

        System.out.println(heb + ab);

}
}