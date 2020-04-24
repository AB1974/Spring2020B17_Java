package Repplit_Solutions;

import java.util.*;

public class repplit039 {
    public static void main(String[] args) {
        /*
        U have an Integer number already declared and assigned value.

Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:

Enter a number:
10
10 is even

Enter a number:
33
33 is odd

Enter a number:
0
0 is even

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //CODE HERE
        if (number % 2 == 0) {
            System.out.print(+number + " is even");
        } else {
            System.out.print(+number + " is odd");
        }
        //   String number2=number%2==0? "even":"odd";
        //   System.out.println(number2);

    }
}
