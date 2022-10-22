package day05_Unary_ShorthandOperators;

public class leapYear {
/*
1. create a class called LeapYear, and write a program that can identify if the given is Leap Year,
print true if it's leap year, otherwise print false
		Ex:
			year = 2020  ==> short;
			LeapYear =true/false;
		output:
			2020 is leap year: true
 */

    public static void main(String[] args) {

        short year = 2019;

        // leapYear: year % 4 == 0
        // if returns true ==> leapYear,  if it returns false ==> not leapYear

        boolean leapYear = year % 4 == 0; //  if the year can be divided by 4 without any reminder,
        // then it's leap year

        //  System.out.println( year + " is leap year: " + leapYear );

        String result =  year + " is leap year: " + leapYear;
        //System.out.println(result);


        System.out.println(2020%2==0);









    }

}




