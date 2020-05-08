package day35_Static;

import java.util.Scanner;

public class StaticPractice {
    //when to use static variable instead of instance

    static Scanner scan = new Scanner(System.in);//static variable you can use everywhere

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();
        System.out.println("Sum is: " + (num1 + num2));

    }

    public void method() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();


        System.out.println("Multiplication:" + (num1 * num2));

    }


}
