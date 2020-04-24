package day00_StudyAtHome;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        String sentence = "I like Java"; //reverse it!!

        String[] words = sentence.split(" ");//[I,like,Java]

        String reverse = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverse+=words[i]+" ";

            System.out.print(words[i] + " ");

        }
        System.out.println();
        System.out.println(reverse);


        
    }
}
