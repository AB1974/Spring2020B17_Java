package day14_StringClass;
import java.util.Scanner;
public class combineTwoString2 {

    public static void main(String[] args) {

        /*
            2. Ask user to enter two words. Print first word without its
            first character then print the second word without its first character.
            Input:
                apple
                banana
            Output:

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first words");

        String firstWord = scan.next();
        firstWord = firstWord.substring(1, firstWord.length());


        System.out.println("Enter second words");

        String secondWord = scan.next();
        secondWord = secondWord.substring(1, secondWord.length());

        String result = firstWord + secondWord;
        System.out.println(result);







    }
}
