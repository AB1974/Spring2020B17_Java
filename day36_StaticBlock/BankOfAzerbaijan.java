package day36_StaticBlock;

import java.util.ArrayList;

public class BankOfAzerbaijan {
    /**
     * 3. create class called BankOfAzerbaijan
     * in the main method:
     * 1. create a List of Employees
     * 2. add random two employees from HumanResources to the List
     * 3. use for each loop to print out the employee info
     * 4. now go back to HumanResources class and comment out the static block
     * 5. repeat the step 3 to print out the employee info to compare it with previous output
     */

    public static void main(String[] args) {


        ArrayList<Employee> list=new ArrayList<>();
        list.add(HumanResources1.employee1);
        list.add(HumanResources1.employee2);
        for(Employee each:list){
            System.out.println(each);
        }

    }

}
