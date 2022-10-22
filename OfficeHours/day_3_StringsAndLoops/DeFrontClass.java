package OfficeHours.day_3_StringsAndLoops;

public class DeFrontClass {
    public String deFront(String str) {

        String word = str.substring(2);

        if(str.charAt(1) == 'b') {
            word = "b" + word;
        }

        if(str.charAt(0) == 'a'){
            word = "a" + word;
        }

        return word;
    }

    public String deFront2(String str) {

        if(str.startsWith("ab")){
            return str;
        } else if(str.startsWith("a")) {
            return "a" + str.substring(2);
        } else if(str.charAt(1) == 'b') {
            return "b" + str.substring(2);
        } else {
            return str.substring(2);
        }
    }



}
