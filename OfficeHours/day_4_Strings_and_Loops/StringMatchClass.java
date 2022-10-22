package OfficeHours.day_4_Strings_and_Loops;

public class StringMatchClass {

    public int stringMatch(String a, String b) {

        int min = Math.min(a.length(), b.length());
        int count = 0;

        for(int i=0; i < min-1; i++) {

            String aa = a.substring(i, i+2);
            String bb = b.substring(i, i+2);

            if(aa.equals(bb)) count++;
        }

        return count;

    }

}
