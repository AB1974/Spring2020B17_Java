package day16_ForLoop2;
import java.util.Scanner;
public class CalculateSum {

    /*
    7. write a program that can calculate the sum of all numbers between 1 to any given number
		ex:
			input: 100
			output: 5050

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {

            sum += i;

        }
        System.out.print(sum);

    }
}
