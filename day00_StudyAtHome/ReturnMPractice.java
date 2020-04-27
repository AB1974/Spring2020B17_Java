package day00_StudyAtHome;

import java.util.*;

public class ReturnMPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int maxLength = scan.nextInt();

        System.out.println(limit(word,maxLength));

    }

    public static String limit(String text, int maxLength) {

        String result=text.substring(0,maxLength);

        return result;

    }
}
