package day00_StudyAtHome;

import java.util.*;

public class Printvowels {


    public static void main(String[] args) {


        //write your code below
        Scanner scan = new Scanner(System.in);
        String eng =scan.nextLine();

        String[]vowels = {"a", "e", "i", "o", "u"};

      //  String word = "ioahuehuehuehue";
        String[] str = eng.split("");


        for (int i = 0; i < str.length; i++) {

            for (int j = 0; j < vowels.length; j++) {

                if (str[i].equals(vowels[j])) {


                    System.out.print(str[i]);
                }

            }

        }
        char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String words = "huehuehuehue";

        char[] ch1 = words.toCharArray();


        for (int i = 0; i < ch1.length; i++) {


            for (int j = 0; j < ch.length; j++) {

                if (ch1[i]==ch[j]) {


                    System.out.print(ch1[i]);
                }

            }

        }

    }
}



