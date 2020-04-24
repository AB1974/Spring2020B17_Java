package day12_JavaRecap;
import sun.jvm.hotspot.debugger.cdbg.basic.BasicLineNumberInfo;

import java.util.Scanner;
public class ScannerRecap {

    /*
    scanner warmup tasks:
    1. write a program that can calculate the area of circle
                needed information:
    1. radius of the circle
    2. Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            oneeight
    3. Write a Java Program that can calculate the grade of a student based on the score,
        implement the following logic:
                If marks < 60, then print "Fail"
                If marks >= 60, but less than 90, then print "Pass"
                If marks >= 90, then print "Passed with Distinction"
                MUST use scanner
    4. Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity.
    Write a program that asks the user to enter product price and quantity and then calculate the revenue.
     If the revenue is more than 5000 a discount is 10% offered. Program should display the discount and net revenue.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  String str =   scan.next();

        //  System.out.println(str);  // next() only takes first word

        // 7921 JonesBranch Dr, McLean VA, 22034
        String fullAddress = "";

        System.out.println("Enter the number of the building: ");
        short Bnumber =  input.nextShort();
        fullAddress += Bnumber+" ";  // fullAddress = fullAddress+Bnumber+" "

        System.out.println("Enter the Street Name: ");
        String streetName = input.next();
        fullAddress += streetName+" ";

        System.out.println("Enter the type of the road");
        String roadType = input.next();
        fullAddress += roadType+", ";

        System.out.println("Enter city name, state, zipcode");
        String cityName = input.next();
        fullAddress += cityName+" ";

        String state = input.next();
        fullAddress += state+", ";

        int zipCode = input.nextInt();
        fullAddress += zipCode;

        System.out.println("Address is: " + fullAddress);


    }

}
