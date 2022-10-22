package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * create a class called company:
 * create 3 objects of employee and set their info
 * create an array of employees and store all those employee objects
 * use regular for loop to print out each employee' name and employeeID
 */
public class Company {

    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static {
        employee1 = new Employee();
        employee1.setEmployeeInfo("Aylin", 45, 'F', 130000, 123456, "SDET");
        employee2 = new Employee();
        employee2.setEmployeeInfo("Engin", 45, 'F', 130000, 1234556, "SDET");
        employee3 = new Employee();
        employee3.setEmployeeInfo("Arin", 45, 'F', 130000, 1234766, "SDET");
    }

    public static void main(String[] args) {

        Employee[] employees = {employee1, employee2, employee3};

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].name+" "+employees[i].employeeID);
        }

    }
}
