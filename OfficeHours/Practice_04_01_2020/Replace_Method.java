package OfficeHours.Practice_04_01_2020;

public class Replace_Method {

    public static void main(String[] args) {

        //replace method
        // (old str,new str)//replaces all the matching ones returns new string!

        String str = "I like C#, C# is cool";

        str = str.replace("C#", "Java");//I like Java, Java is cool.

        System.out.println(str);


        //replace first (old str,new str) replaces first matching one ,returns new string!

        String t1 = "Java is fun,Java is good";
        t1 = t1.replaceFirst("Java","C#");

        System.out.println(t1);

    }
}
