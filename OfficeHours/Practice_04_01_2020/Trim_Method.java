package OfficeHours.Practice_04_01_2020;

public class Trim_Method {

    public static void main(String[] args) {

        //trim removes unused(white) spaces from the string

        String str7 = "        Cybertek";//returns new String

        str7 = str7.trim();//trim removes white spaces

        System.out.println(str7);//trim removes white spaces

        String str8 = "1     1";
        str8 = str8.trim();

        System.out.println(str8);//0

    }
}
