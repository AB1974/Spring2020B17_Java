package day15_ForLoop;
import java.util.Scanner;
public class repplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();



        if (word.length() < 5 && word.length()>=0) {
            System.out.println("Too short!");

        } else if (word.length() >= 6) {
            System.out.println("Too long!");


        } else {

            String result = ""+word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);

            System.out.println(result);

        }


    }}
