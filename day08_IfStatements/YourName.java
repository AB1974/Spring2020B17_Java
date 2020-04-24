package day08_IfStatements;

import java.util.Scanner;

public class YourName {

    public static void main(String[] args) {

       Scanner scan = new Scanner (System.in);
        System.out.println("Hi, What is your name? ");

        String name =scan.next();
        System.out.println("Nice to meet you, "+name);

    }
}
