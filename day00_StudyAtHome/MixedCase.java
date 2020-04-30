package day00_StudyAtHome;

import java.util.Scanner;

public class MixedCase {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        String out ="";

        for (int i=0; i < s.length(); i++){
            if (i %2 ==0){
                out += s.substring(i,i+1).toLowerCase();
            }else {
                out += s.substring(i,i+1).toUpperCase();
            }
        }
        System.out.println(out);




    }
}