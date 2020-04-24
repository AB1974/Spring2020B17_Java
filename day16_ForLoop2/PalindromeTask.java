package day16_ForLoop2;

import java.util.Scanner;

public class PalindromeTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");

        String word = input.nextLine();
        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reverseWord += word.charAt(i);
        }

        boolean palindrome = word.equalsIgnoreCase(reverseWord);
        System.out.println(palindrome);



    }
}
