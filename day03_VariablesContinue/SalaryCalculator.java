package day03_VariablesContinue;


public class SalaryCalculator {

/*
    Warmup task:
    Create a class called salary calculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
    ex:
            if:
    rate = 55;
    stateTax = 0.04;
    federalTax =0.22;
    weeklyHours = 40;
*/

    public static void main(String[] args) {

        double rate = 45;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 45;

        // salary = rate * weeklyHour * 4 * 12
        double salary = rate * weeklyHours * 52;

        // stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        // FederalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        // income after tax = salary - (stateTax + federalTax );
        double incomeAfterTax = salary - (stateTax + federalTax);

        System.out.println("Your salary is: " + salary); // concatenation
        System.out.println("State tax is: " + stateTax);  // state tax is 4575
        System.out.println("Federal tax is: " + federalTax);
        System.out.println("Total tax is: " + ( stateTax + federalTax ) );
        System.out.println("Your take home salary is: "+incomeAfterTax );


        /*
        System.out.println(9 + 3 ); // 12, addition
        System.out.println( "9" + "3" ); // 93
        System.out.println(9 + "3"); //93
    */



    }




}