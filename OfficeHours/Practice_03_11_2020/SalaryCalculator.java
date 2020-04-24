package OfficeHours.Practice_03_11_2020;

public class SalaryCalculator {

    public static void main(String[] args) {
        double rate =55;
        double salary = 55*40*48; //40 hours a week and 48 weeks a year
        double totalTax =salary*0.04+salary*0.22;
        double netIncome = salary-totalTax;

        System.out.println("your salary is: "+salary+"USD");
        System.out.println("your total tax is: "+totalTax+"USD");
        System.out.println("your income after tax is: "+ netIncome+"USD");
        /*

        Task 08:
		Create a class called salary calculator, write a program that can calculate the tax,
		and salary after tax based on the hourly rate & tax rates
			ex:
				if:
					rate = 55;
					stateTax = 0.04;
					federalTax =0.22;
					weeklyHours = 40;
				then output will be:
					your salary is: 105600 USD
					your total tax is: 27456 USD
					your income after tax is: 78144 USD
				if:
					rate = 45.25;
					stateTax =0.045;
					federalTax = 0.25;
					weeklyHours = 45;
				then output will be:
					your salary is: 91260 USD
					your total tax is: 26921.7
					your income after tax: 64338.3 USD
         */
    }
}
