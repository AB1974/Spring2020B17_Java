package OfficeHours.Practice_04_01_2020;

public class IndexOf_Method {

    public static void main(String[] args) {

        //indexOf:returns the index of first matching character as an !!!INT !!!


        String y1 = "Today W is Wednesday";

        int a = y1.indexOf("W");//first matching !!
        int a1 = y1.indexOf("Wednesday"); // W's index number

        System.out.println(a);

        System.out.println(a1);

        //lastIndexOf:returns the index of last matching character as an !!!INT !!!

        String y2 = "Cybertek School, School";

        int a3 = y2.lastIndexOf("S");//index number of last "S"

        System.out.println(a3);


    }
}
