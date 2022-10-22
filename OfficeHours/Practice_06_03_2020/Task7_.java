package OfficeHours.Practice_06_03_2020;

import java.util.Arrays;

public class Task7_ {

       /*
    7) Create a method that will accept a String of
    multiple words separated by a space and return a 2D array.
    Each array in the multidimensional array will have two elements:
    the number of uppercase letters and the number of lowercase letters
     */

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(countAll("The hOusE IS biG how mAnY words")));
    }

    public static int [][] countAll(String str) {

        String [] words = str.split(" ");
        int [][] count = new int[words.length][0];
        int index = 0;

        for(String word :words) {

            int upper = 0;
            int lower = 0;

            for(int i=0; i < word.length(); i++) {

                if(Character.isUpperCase(word.charAt(i))){
                    upper++;
                } else if(Character.isLowerCase(word.charAt(i))){
                    lower++;
                }

            }

            int [] each = {upper, lower};
            count[index++] = each;
        }
        return count;
    }


}


