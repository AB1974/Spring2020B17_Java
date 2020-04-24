package day17_WhileDoWhileLoop;
import java.util.Scanner;
public class PracticesAtHome {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter Yes or No ");

        String word =input.next();

        boolean valid= word.equalsIgnoreCase("yes")||word.equalsIgnoreCase("no");

        while(!valid){//repeat action
            System.out.println("please re-enter");
                 word =input.next();
                if(word.equalsIgnoreCase("yes")||word.equalsIgnoreCase("no")){
                    break;//under what condition you exit the loop!
                }
        }
        if(word.equalsIgnoreCase("yes")){
            System.out.println("Entered Yes");
        }

        if(word.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }
    }
}