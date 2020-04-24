package day15_ForLoop;

import java.util.Scanner;

public class PalindromeTask {

    public static void main(String[] args) {

         /*
        write a program to identify if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();

//anna

        String wordReverse = "";
        for (int num = word.length() - 1; num >= 0; num--) {
            wordReverse = wordReverse + word.charAt(num);//an
        }

            if (wordReverse.equals(word)){
                System.out.println("true");
            }else System.out.println("false");


        }

    }

//adanada
//0123456
//for(int num=6;num>=0;num--){
//
//}