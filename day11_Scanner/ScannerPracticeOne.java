package day11_Scanner;
import java.util.Scanner;
public class ScannerPracticeOne {
    public static void main(String[] args) {
        /*
         1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employee status:
        salary:
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your user name");

                String firstname=scan.next();

        System.out.println("Enter your last name");
                String lastname=scan.next();

                String fullName=firstname+" "+lastname;

        System.out.println("Ful name is :"+fullName);


        System.out.println("Are you employeed?");

        boolean employmentStatus =scan.nextBoolean();
        double salary =0;
        if(employmentStatus==true){

            System.out.println("Enter your salary:");
            salary=scan.nextDouble();/////BE CAREFUL THIS PART
        }

        System.out.println("Employeed:"+employmentStatus);
        System.out.println("Salary: $"+salary);





    }

}
