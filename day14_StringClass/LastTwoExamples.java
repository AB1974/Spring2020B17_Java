package day14_StringClass;
import java.util.Scanner;
public class LastTwoExamples {
    public static void main(String[] args) {
        /*
        3. Ask user to enter a word. Print true is the first and last
        characters of the string are same characters, print false otherwise.
			Input:
				abba
			Output:
				true
        4. Ask user to enter a word. Print "really?"  if the word ends with ly,
         print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?
         */
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a word");
        String word =scan.next();


/*
        char first =word.charAt(0);
        char last = word.charAt(word.length()-1);
        if((""+first).equals((""+last))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
*/
        System.out.println("===============second solutions========");
        System.out.println(word.substring(0,1));
        System.out.println(word.substring(word.length()-1,word.length()));

        System.out.println("==========task4=================");
        String s1 ="really";

        System.out.println(s1.lastIndexOf("l"));
        System.out.println(s1.substring(4));
        System.out.println(s1.charAt(s1.length()-1));




    }
}
