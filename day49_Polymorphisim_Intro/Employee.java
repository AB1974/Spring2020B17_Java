package day49_Polymorphisim_Intro;

import OfficeHours.Practice_05_06_2020.Developer;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Employee {

    /**
     * 1. create an abstract class named Employee:
     * attributes: name, id, jobTitle, Salary,...
     * abstract method: work()
     * 2. create class named Tester that inherits from emplyee
     * 3. create class named Developer that inherits from emplyee
     * 4. create a class named ScrumTeam:
     * create an arraylist and store 3 testers and 4 developers
     */

    public String name;
    public String jobTitle;
    private double salary;
    private long id;

    abstract void work();



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString() {
        return "Name: " + name + " Id: " + id + " JobTitle: " + jobTitle + " Salary: $" + salary+"\n";
    }
}


class Testers extends Employee {

    Testers(String name, long id, String jobTitle, double salary) {
        this.name = name;
        setId(id);
        this.jobTitle = jobTitle;
        setSalary(salary);


    }
    void work() {
        System.out.println(name + " is working on SmokeTEst");

    }


}

class Developers extends Employee {

    Developers(String name, long id, String jobTitle, double salary) {
        this.name = name;
        setId(id);
        this.jobTitle = jobTitle;
        setSalary(salary);


    }
    void work() {
        System.out.println(name + " is working on UNIT Test");

    }

}

class ScrumTeam {

    public static void main(String[] args) {
        Employee tester1 = new Testers("Raj",123456,"SDET",110000 );
        Employee tester2 = new Testers("Nasri",123456,"QA",100000) ;
        Employee tester3 = new Testers("John",123456,"SDET",120000 );
        Employee developer1 = new Developers("Paul", 9876, "SeniorDeveloper", 140000);
        Employee developer2 = new Developers("Ugur", 98761, "JuniorDeveloper", 110000);
        Employee developer3 = new Developers("Tural", 98767, "SeniorDeveloper", 150000);

    //    Employee[] ScrumTeam={tester1,tester2,tester3,developer1,developer2,developer3};
    //    System.out.println(Arrays.toString(ScrumTeam));
        ArrayList<Employee> ScrumTeam2=new ArrayList<>();
        ScrumTeam2.addAll(Arrays.asList(tester1,tester2,tester3,developer1,developer2,developer3));
        System.out.println(ScrumTeam2);

    }
}