package day34_CustomClass;
/**
 * create a class called Testers
 * 			Attributes:
 * 				name, employeeID, JobTitle, Salary
 * 			Actions:
 * 				setTesterInfo(), smokeTesting(),  creatingTicket();
 *              create a class called Bank Of America:
 * 			bank of America is planning to create their automation team,
 * 			there fore they are hiring three testers
 * 			create a list called AutomationTeam and store three Testers in it
 * 			write a program that can remove the tester if he/she is manual tester
 * 			write a program that can calculate the total budget of the Automation team
 */

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Madina", 1112233445,"QA", 200000.00);;

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Venera",234567834,"Senior SDET",130000 );

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Sha Rejepov",6235487,"SDET",100000);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("Muhtar",111, "Manual Tester", 120000);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("John", 22222, "Uber Driver", 60000);

        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1, tester2, tester3, tester4, tester5) );

        testers.removeIf( p -> !p.jobTitle.contains("SDET") );

        double totalBudget = 0;
        for( Tester each :  testers){
            System.out.println(each);
            totalBudget += each.salary;
        }

        System.out.println(totalBudget);


    }
}
