package OfficeHours.day_5_ArraysAndArrayList;

import java.util.Arrays;

public class ReverseEachPart {
     /*
    6) Create a method that will accept a String
    of multiple words separated by a space and
    return the String with which part reversed.
    Ex: "The house is big"
	-> eht esuoh si gib
     */

    public static void main(String[] args) {
        System.out.println(reverseEachWord("The house is big how many words"));
    }

    public static String reverseEachWord(String str) {

        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String finalWord = "";

        for(String word: words) {

            finalWord += reverse(word)+ " ";

        }

        return finalWord;

    }

    // helper method

    public static String reverse (String word) {
        String rev = "";
        for(int i = word.length()-1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        return rev;
    }

}
