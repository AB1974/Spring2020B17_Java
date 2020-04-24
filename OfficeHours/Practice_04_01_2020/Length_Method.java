package OfficeHours.Practice_04_01_2020;

public class Length_Method {
    public static void main(String[] args) {


        //length; returns the total number of chars ,int

        String str2 = "Cybertek School";
        // 123456789101112131415

        int num = str2.length();
        System.out.println(str2.length());

        //maximum index number == length( )-1

        int maxIndex = str2.length() - 1;

        char ch3 = str2.charAt(maxIndex);

        System.out.println(maxIndex);//maximum index number is length()-1;ss LengthMethod

        System.out.println(ch3);




    }
}
