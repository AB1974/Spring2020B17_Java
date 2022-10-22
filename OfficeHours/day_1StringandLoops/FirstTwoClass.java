package OfficeHours.day_1StringandLoops;

public class FirstTwoClass {
    public static void main(String[] args) {
        System.out.println(firstTwo("hello"));
        System.out.println(firstTwo(""));
        System.out.println(firstTwo("g"));
    }

    public static String firstTwo(String str) {

        if(str.length() < 2) return str;

        return str.substring(0,2);

        // return str.length() >= 2 ? str.substring(0,2)  : str;

    }


}

