package OfficeHours.day_4_Strings_and_Loops;

public class Last2Class {
    public int last2(String str) {

        if(str.length() < 2) return 0;

        String last = str.substring(str.length() -2);
        int count = 0;

        for(int i=0; i < str.length() -2; i++) {

            if(str.substring(i, i+2).equals(last)) count++;

        }
        return count;
    }
}
