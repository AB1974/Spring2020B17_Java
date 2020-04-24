package day17_WhileDoWhileLoop;
import java.util.Scanner;
public class WhileLoopYesNoPractice {
    public static void main(String[] args) {


        /*
        ask user enter yes or no ?
        if user enters something other yes no repeat the question(previous step)
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter YES or NO");
        String str =scan.next();

        boolean valid=str.equalsIgnoreCase("yes")||str.equalsIgnoreCase("NO");
        while(!valid){
            System.out.println("Please re enter");
             str =scan.next();

             if(str.equalsIgnoreCase("yes")||str.equalsIgnoreCase("No")){
                 break;
             }
        }

        if(str.equalsIgnoreCase("Yes")){
            System.out.println("Entered yes");
        }

        if(str.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }

    }
}
