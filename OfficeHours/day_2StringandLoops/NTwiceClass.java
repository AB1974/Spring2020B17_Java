package OfficeHours.day_2StringandLoops;

public class NTwiceClass {

    public static void main(String[] args) {
        NTwiceClass s = new NTwiceClass();//if method is instance method you need to create object
        //to get the method!

        System.out.println(s.nTwice("Hello",2));//Helo
    }

    public  String nTwice(String str, int n) {

        String result = "" + str.substring(0, n) + str.substring(str.length() - n);

        return result;
    }



}
