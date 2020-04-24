package OfficeHours.Practice_04_01_2020;

public class StartsEndsWith_Method {
    public static void main(String[] args) {

       // startsWith(str);Checks if the string stated with the given str!
        //endsWith(str);Checks if the string ends with the given str!

        String webAddress = "www.amazon.com";

        System.out.println( webAddress.startsWith("www"));//true
        System.out.println(webAddress.startsWith("wwww"));//false



        System.out.println(webAddress.endsWith("gmail.com"));//false
        System.out.println(webAddress.endsWith("amazon.com"));//true



    }
}
