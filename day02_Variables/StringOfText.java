package day02_Variables;

import sun.jvm.hotspot.asm.SymbolFinder;

import java.util.Scanner;

public class StringOfText {

    public static void main(String[] args) {
        String employeeName = "Asiya";
        String companyName = "Capital One";
        //  System.out.println("Muhtar");
        employeeName = "Muhtar";
        companyName = "Bank of America";
        System.out.println(employeeName);

        /*
        Employee Name is: Muhtar
        Company Name is: Bank of America
        Muhtar works at Bank of America
         */

        System.out.println("Employee Name is: " + employeeName);
        System.out.println("Company name is: " + companyName);
        System.out.println(employeeName + " works at " + companyName);

        System.out.println("========================================================");

        System.out.println("Employee Name is: " + employeeName + "\nCompany Name is: "
                + companyName + "\n" + employeeName + " works at " + companyName);

        System.out.println("======================Aylin===================================");


        String a = "I hate Java";

        a = "I love Java";

        System.out.println(a);

        System.out.println("Aylin : "+ a + " "+"Engin approved");


        System.out.println("-----------------------------------");

        byte t = 50;
        int  b = 44;

        System.out.println("I will learn "+"\""+t+"\""+" and "+"\""+b+"\""+ " at CybertekSchool.");

        System.out.println("Verilen " +b +" " +t + "'den kucuktur.");


        Scanner scan = new Scanner(System.in);
        String lan1 = scan.nextLine();
        String lan2 = scan.nextLine();

        //WRITE YOUR CODE BELOW THIS LINE:

        System.out.println("I will learn"+lan1+"and"+lan2+"at CybertekSchool");


    /*

        String fullName = "Joshua Millage";
		String address = "Virginia";
		String car = "BMW";
		int ssn = 1234567;
		String favoriteFood = "Pizza";

		System.out.println("Full name is: " + fullName );
		System.out.println("Favorite food is: "+favoriteFood);
		System.out.println("Address is: "+address);
		System.out.println("Car: "+car);
		System.out.println("Social Security Number is: "+ssn);
     */





    }

}
