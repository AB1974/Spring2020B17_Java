package PracticeLoopReview;
import java.util.Scanner;
public class Palendrome {

    //loop through reverse order and
    //concatenate each character to reversed string.
    //compare if the word and reversed are equal.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word to test:");
        String word = scan.next();
        String reversed = "";

        int idx = word.length() - 1;

        while (idx >= 0) {

            reversed = reversed + word.charAt(idx);
            idx--;
        }
        System.out.println(reversed);
        if(reversed.equalsIgnoreCase(word)){

            System.out.println("it's palenrome");
        }else{
            System.out.println("it's not a palendrome");
        }
    }
}
