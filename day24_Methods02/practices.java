package day24_Methods02;

import java.util.*;

public class practices {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            print5stars();
        }
        introduce();

        showMe5Numbers();
        showMe5Numbers();
        //while (true) {
        // showMe5Numbers();
        //}
        push10Ups();
        push10Ups();
        rangePrint();


    }

    public static void print5stars() {

        System.out.println("* * * * * * * * * * * * * * * * * * *");


    }
/*
method name :introduce;
parameter/arg=nothing
return type :void
It will ask for a name nice to meet you
 */

    public static void introduce() {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Nice to meet you " + name);


    }


    public static void showMe5Numbers() {

        Random r = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.print(r.nextInt(1001) + " ");

        }

        System.out.println();
    }


    public static void push10Ups() {
        int count = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pushup -" + count);
            count++;
        }
        System.out.println("Time to rest");
    }

    public static void rangePrint() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scan.nextInt();//2
        int num2 = scan.nextInt();//5

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }

        } else if (num1 > num2) {

            for (int k = num1; k >= num2; k--) {

                System.out.print(k + " ");
            }
        } else {
            System.out.println(num1);
        }
        System.out.println();

    }
}
