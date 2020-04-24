package day20_Arrays02;

import java.util.Arrays;
import java.util.Scanner;
public class Students {

    public static void main(String[] args) {
        // write a program that asks "enter a name" 10 times, and store each of the names in the array students
        Scanner scan =new Scanner(System.in);

        String[] students = new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter a name ");
            String sName = scan.nextLine();

            students[i] = sName;

        }
        System.out.println(Arrays.toString(students));

    }
}
