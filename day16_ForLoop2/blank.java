package day16_ForLoop2;

import java.util.Scanner;

public class blank {

    public static void main(String[] args) {


        String address="4948 Sentinel Dr, BETHESDA,MD 20816";
        String email ="randon@email@gmail.com";

        System.out.println(address.substring(address.indexOf("B"),address.lastIndexOf(",")));
        System.out.println(email.substring(email.indexOf("g"),email.indexOf(".")));

        System.out.println((email.substring(email.lastIndexOf("g"),email.lastIndexOf("."))));


        String str ="";

        if(str.isEmpty()){

            System.out.println("Is empty");
        }else{
            System.out.println("is not empty");
        }

        String name ="Muthar is good guy";
        Boolean result =name.contains("abc");
        System.out.println(result);


        boolean result1=name.startsWith("M");
        System.out.println(result1);

String word = "xmasdux";
        boolean a =word.toUpperCase().substring(0,1).contains("X") && !word.toUpperCase().substring(word.length()-1).contains("X");
        boolean b = word.toUpperCase().substring(word.length()-1).contains("X") && !word.toUpperCase().substring(0,1).contains("X");
        boolean ab =word.toUpperCase().substring(0,1).contains("X") && word.toUpperCase().substring(word.length()-1).contains("X");
        if (a) {
            System.out.println(word.substring(1));
        }
       else if (b) {
            System.out.println(word.substring(0,word.length()-1));
        }
       else if (ab){
    System.out.println(word.substring(1,word.length()-1));
}
      else {
    System.out.println(word);
}










}

    }






