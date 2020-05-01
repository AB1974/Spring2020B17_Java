package day00_StudyAtHome;

import java.util.ArrayList;
import java.util.Arrays;

public class replit170 {
    public static String clean(String text, String badWord) {

        text=text.replaceAll(badWord,"");
        return text;
    }

    public static void main(String[] args) {
        String str=clean("hi hey bla bla ","bla");
        System.out.println(str);
    }
}