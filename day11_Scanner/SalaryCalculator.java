package day11_Scanner;
import jdk.management.resource.internal.TotalResourceContext;

import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {

      Scanner input=new Scanner(System.in);
        System.out.println("Enter your salary: ");

                int salary = input.nextInt();

        System.out.println("Enter the state tax rate: ");

                byte stateTax = input.nextByte();
                double stateTaxPercentage = stateTax/100.0;

        System.out.println("Enter the federal tax rate : ");
            byte federalTax=input.nextByte();
            double federalTaxPercentage = federalTax / 100.0;
        //total tax = (federal tax percentage +state tax percentage)*salary


        double totalTax=(federalTaxPercentage+stateTaxPercentage)*salary;

        double salaryAfterTax=salary- totalTax;
        System.out.println("Your salary after tax is: $"+ salaryAfterTax);
        System.out.println("Total Tax: $"+totalTax);
            }

    }

