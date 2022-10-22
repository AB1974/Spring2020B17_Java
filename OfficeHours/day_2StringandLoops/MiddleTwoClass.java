package OfficeHours.day_2StringandLoops;

public class MiddleTwoClass {

    public String middleTwo(String str) {

        int middl1 = str.length() / 2 - 1;
        int middl2 = str.length() / 2;

        //two solutions;

        //String word=""+str.charAt(str.length()/2-1)+str.charAt(str.length()/2);
        //return word;

        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);



    }


}

