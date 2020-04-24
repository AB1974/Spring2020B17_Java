package day14_StringClass;

import java.util.Scanner;

public class combineTwoString {

    public static void main(String[] args) {

        /*

	 1. Ask user to enter two words. Print the first word, second word, second word, first word
            Input:
                one
                two
            Output:
                onetwotwoone
                    DO NOT USE + OPERATOR

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first word");

        String firstWord = scan.next();

        System.out.println("Enter the second word");

        String secondWord = scan.next();

        String result = firstWord.concat(" "+secondWord).concat(" "+secondWord).concat(" "+firstWord);
        System.out.println(result);

    }

}
