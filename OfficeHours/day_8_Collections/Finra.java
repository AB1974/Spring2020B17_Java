package OfficeHours.day_8_Collections;

public class Finra {

    /*
    * Finra: Create a method that will accept a number and
    * print out all the numbers from 1 to that given number.
    *
	Conditions: If the number is a multiple of 3 print "FIN",
	* if the number is a multiple of 5 print "RA", if the number
	* is a multiple of 3 and 5 print "FINRA".
	* Otherwise in all other cases print the number itself
     */

    public static void main(String[] args) {
        finraTo(100);
    }


    public static void finraTo(int end) {

        for(int i=1; i <= end; i++) {

            String s = "";

            if(i % 3 == 0) s = "FIN";

            if(i % 5 == 0) s += "RA";

            System.out.println(s.isEmpty() ? i : s);

        }

    }


}
