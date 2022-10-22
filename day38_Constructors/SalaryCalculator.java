package day38_Constructors;

/**
 * 03:
 * Create class called SalaryCalculator
 * instance variables:
 * hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
 * add a constructor can initialize those fields
 * instance methods:
 * salary(): returns the total salary as double(hourly rates*weeklyHours*48)
 * salaryAfterTax(): returns the salary after tax as double(salary()-stateTax()-FederalTax()
 * stateTax(): returns the total state tax as double(salary()*stateTaxRate)
 * federalTax(): returns the total federal tax as double(salary()*federalTaxRate)
 * toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */

public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {//constructor
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary() {

        return hourlyRate * weeklyHours * 48;
    }

    public double stateTax() {
        return salary() * stateTaxRate;
    }

    public double federalTax() {

        return salary() * federalTaxRate;
    }

    public double salaryAfterTax() {

        return salary() -( stateTax() + federalTax() );
    }

    public String toString(){

        return "Hourly Rate: $"+hourlyRate+
                "\nWeekly Hours: "+weeklyHours+
                "\nGross Salary: $"+salary()+
                "\nState Tax: $"+stateTax()+
                "\nFederal Tax: $"+ federalTax()+
                "\nNet Salary: $"+salaryAfterTax();
    }

    public static void main(String[] args) {

        SalaryCalculator Aylin =new SalaryCalculator(70,40,5.75/100,0.2);
        System.out.println(Aylin);
        SalaryCalculator Ayse =new SalaryCalculator(60,40,8.75/100,0.2);
        System.out.println(Ayse);
    }

}
