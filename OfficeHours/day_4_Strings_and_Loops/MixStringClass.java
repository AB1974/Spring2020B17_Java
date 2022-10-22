package OfficeHours.day_4_Strings_and_Loops;

public class MixStringClass {
    public String mixString(String a, String b) {

        int max = Math.max(a.length(), b.length());

        // int max = 0;

        // if(a.length() > b.length()) {
        //   max = a.length();
        // } else {
        //   max = b.length();
        // }

        // int max = a.length() >= b.length() ? a.length() : b.length();

        String word = "";

        for(int i=0; i < max; i++){

            if(i < a.length()){
                word += a.charAt(i);
            }

            if(i < b.length()) {
                word += b.charAt(i);
            }
        }

        return word;

    }
}
