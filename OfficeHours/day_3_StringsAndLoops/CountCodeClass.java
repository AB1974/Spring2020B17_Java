package OfficeHours.day_3_StringsAndLoops;

public class CountCodeClass {
    public int countCode(String str) {

        int code = 0;
        // co * e
        for(int i=0; i < str.length() -3; i++) {

            String word = str.substring(i, i+4);

            if(word.startsWith("co") && word.endsWith("e")) code++;

        }

        return code;


        //////////

        // int code = 0;
        // // co * e
        // for(int i=0; i < str.length() -3; i++) {

        //   String word = str.substring(i,i+2) + "d" + str.substring(i+3, i+4);
        //                                               // str.charAt(i+3);
        //   if(word.equals("code")) code++;
        // }

        // return code;

        ///////////////

        // int code = 0;
        // // co * e
        // for(int i=0; i < str.length() -3; i++) {

        //   if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o'
        //   && str.charAt(i+3) == 'e') code++;

        // }

        // return code;

    }
}
