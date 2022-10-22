package MixedEveryting;

import java.util.Arrays;

public class Task6 {

    /**
     * 6) Create a method that will accept a String
     * of multiple words separated by a space and
     * return the String with which part reversed.
     * Ex: "The house is big"
     * -> eht esuoh si gib
     */

    //method 1(Helper method) Reverse whole str
    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            rev += str.charAt(i);
        }
        return rev;
    }

    //asil method bu
    public static String rev(String s) {

        String word[] = s.split(" ");
        String finalWord = "";
        for (String each : word) {
            finalWord += reverse(each)+" ";
        }
        return finalWord;
    }

    public static void main(String[] args) {
        String so = "The house is big";
        System.out.println(rev(so));
    }
}
