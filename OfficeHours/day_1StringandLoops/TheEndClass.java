package OfficeHours.day_1StringandLoops;

public class TheEndClass {
    public String theEnd(String str, boolean front) {
        // String res = "";

        // if(front) {
        //   res = str.substring(0,1);
        //   // res = "" + str.charAt(0);
        //   // res = String.valueOf(str.charAt(0))l
        // } else {
        //   res = str.substring(str.length()-1);
        // }

        // return res;

        //////-----


        // if(front) {
        //   return str.substring(0,1);
        // } else {
        //   return str.substring(str.length()-1);
        // }


        if(front) return str.substring(0,1);

        return str.substring(str.length()-1);


    }



}

