package day01_FirstJavaProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class SelfStudyStream2 {

    public static void main(String[] args) {

//"====First Method===="
        String name = " Aylin";
        StringBuilder stringBuilder=  new StringBuilder(name);
        System.out.println(stringBuilder.reverse());

        //"====Second Method====" 
        String name2= "Engin";
        String reverse2="";
        String arr[] = name2.split("");

        for (int i=arr.length-1 ; i>=0 ;i--){
           reverse2+= arr[i];
        }
        System.out.println("reverse2 = " + reverse2);

        //"====Third Method= Stream==="
        String name3= "Engin";
        String arr3[] = name2.split("");
        List<String> list = new ArrayList<String>(Arrays.asList(arr3));
        List<String > rtt= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("rtt = " + rtt);

        //"====Third Method= Stream==="
        String str="aylinbekem";
        String reverse="";

        for (int i=str.length()-1; i>=0 ;i--) {
            reverse += ""+str.charAt(i);
        }
        System.out.println("String    "+reverse);

        //PALINDROME
        String pal ="Adanada";
        String pal2 ="";

        for ( int i =pal.length()-1 ;i>=0 ;i--){
            pal2+=pal.charAt(i);
        }

        Boolean b1= pal2.equalsIgnoreCase(pal);
        System.out.println("b1 = " + b1);


        //ascending//descending
        
        Integer [] sayi = {1,8,20,49,509,6,7,8,};
        
        List <Integer> ls = new ArrayList<>(Arrays.asList(sayi));
        ls=ls.stream().sorted().collect(Collectors.toList());
        System.out.println("ls = " + ls);
        ls=ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("ls = " + ls);
        



    }
}
