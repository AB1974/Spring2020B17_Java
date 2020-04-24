package day08_IfStatements;

import java.util.*;
public class repplitwarmupfrommoradil {

/*
Declare  3 variables
5
3
1
sum=>9
Display prompt"Enter 3 numbers:"
Using scanner object let user input 3 numbers
add 3 numbers and assign to sum variable
print "Sum of numbers:ValueOfSum"

 */
    public static void main(String[] args) {

        int num1,num2,num3,sum;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");

        num1 = scan.nextInt();
        num2 =scan.nextInt();
        num3 = scan.nextInt();

        sum = num1+num2+num3;
        System.out.println("Sum of numbers: "+sum);


    }

}
