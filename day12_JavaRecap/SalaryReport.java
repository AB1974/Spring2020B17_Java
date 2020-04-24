package day12_JavaRecap;
import java.util.Scanner;
public class SalaryReport {
    /*
    ask the user enter salary
    ask the user enter full name
    ask the user enter enter company name
    ask the user enter enter SSN
    ask the user enter enter job title

     */
    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);
        System.out.println("Enter your salary:");

        double salary =scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter your full Name:");

        String fullName=scan.nextLine();

        System.out.println("Enter Company Name: ");

        String companyName=scan.nextLine();

        System.out.println("Enter your SSN Number:");

        long SSNNumber=scan.nextLong();

        scan.nextLine();

        System.out.println("Enter your job title:");

        String jobTitle=scan.nextLine();

        System.out.println("full name is :"+fullName);
        System.out.println("Job title is :"+jobTitle);
        System.out.println("Company name is :"+companyName);
        System.out.println("SSN :"+SSNNumber);
        System.out.println("Salary: $"+salary);











    }

}
