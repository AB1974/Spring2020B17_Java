package OfficeHours.Practice_04_01_2020;

public class Substring_Method {
    public static void main(String[] args) {

        //substring (beginning index,ending index):creates substring from beginning index till ending index!
        // (ending index is excluded)

        //substring(beginning index):

        String sentence = "I like Java";
        // 012345678910

        //last index number =length-1 but if you want last character to be print
        //you need to call length method only.
        String word1 = sentence.substring(7, sentence.length());

        String word2 = sentence.substring(2, 6);

        String word3 = sentence.substring(2, 6) + sentence.substring(7, sentence.length());

        System.out.println(word1);//java

        System.out.println(word2);//like

        System.out.println(word3);//likeJava


        //below method creates new string from beginning index till the end of the string !
        String sentence2 = "I like to learn Java";//learn Java

        String r1 = sentence2.substring(10);

        System.out.println(sentence2.substring(10));
        System.out.println(r1);

        //new example how to write JaVa from Java

        String r2 = "Java"; //JaVa;
            //       0123
        String r3 = r2.substring(0, 2);   //Ja

        String r4 = r2.substring(2,3) ;  // v
        r4 = r4.toUpperCase(); //V

        String r5 = r2.substring(3); //a

        String result = r3+r4+r5; // JaVa
        System.out.println(result);

    }
}
