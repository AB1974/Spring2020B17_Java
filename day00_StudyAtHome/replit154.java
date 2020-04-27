package day00_StudyAtHome;

import java.util.*;

public class replit154 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num) {
        //WRITE YOUR CODE HERE
        String str = "" + num;
        String reverse = "";
        int lastIndex = str.length() - 1;

        for (int i = lastIndex; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}


