package OfficeHours.Practice_04_15_2020;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {


       /*
    String methods:
            toCharArray(): returns char array
            split(str): splits the string by given str, returns string array
     */

        public static void main(String[] args) {
            String str = "Cybertek";

            char[] ch =  str.toCharArray();  //['C','y', b,e,r,t,e,k]

            System.out.println( str.length() == ch.length); // true

        /*
        str1 = "abc",  str2="cab"
        ['a','b','c']
        ['c', 'a', 'b']
        ['a','b','c']
        ['a','b','c']
         */

            String str1 = "ABCD";
            String str2 = "BAC";



            char[] ch1 = str1.toCharArray();  // ['a','b','c']
            char[] ch2 = str2.toCharArray(); //   ['c', 'a', 'b']

            Arrays.sort(ch1);  //  ['a','b','c']
            Arrays.sort(ch2); //  ['a','b','c']

            System.out.println( Arrays.equals(ch1,ch2) );

            System.out.println("==========================================================");

            String sentence = "I like to learn java";

            String[] words =  sentence.split(" "); // [I, like, to, learn, java]

            System.out.println( Arrays.toString(words) );

            int totalWords = words.length;
            System.out.println(totalWords);

            String result= "";

            // [I, like, to, learn, java]
            for(int i = words.length-1; i>=0   ;i--){
                // System.out.print( words[i] +" ");
                result += words[i] +" ";
            }

            System.out.println(result.trim());


            //java learn to like I

        }
}
