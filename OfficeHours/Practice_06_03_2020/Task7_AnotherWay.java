package OfficeHours.Practice_06_03_2020;

import java.util.Arrays;

/**
 * [Challenge]
 * 7) Create a method that will accept a String of multiple words separated by a
 * space and return a 2D array. Each array
 * in the multidimensional array will have two elements:
 * the number of uppercase letters and the number of lowercase letters
 */
public class Task7_AnotherWay {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(countAll("The hOusE IS biG how mAnY words")));
    }

        public static int[][] countAll(String str) {

        String[] words = str.split(" ");
        int[][] count = new int[words.length][2];
        int index = 0;

        for (String word : words) {
            count[index++] = countUpperLower(word);
        }
        return count;
    }
    public static int[] countUpperLower(String word) {

            int upper = 0;
            int lower = 0;

            for (int i = 0; i < word.length(); i++) {

                if (Character.isUpperCase(word.charAt(i))) {
                    upper++;
                } else if (Character.isLowerCase(word.charAt(i))) {
                    lower++;
                }

            }
            return new int [] {upper,lower};

    }
}