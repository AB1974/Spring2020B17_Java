package OfficeHours.Practice_04_08_2020;
import java.util.Scanner;
public class FindingMaxAndMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = -2147483648; //  20
        int min = 214748367; //5

        int i = 1;
        while (i <= 5) {

            System.out.println("Enter a number");
            int num = input.nextInt(); //10, 20, 5

            if (num > max) { // whichever the user input is larger, will be assigned to max
                max = num;
            }

            if (num < min) { // whichever user input is smaller, will be assigned to min
                min = num;
            }

            i++;
        }

        System.out.println("maximum number is " + max);
        System.out.println("minimum number is " + min);


    }
}