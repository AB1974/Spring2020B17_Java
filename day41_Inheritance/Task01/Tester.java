package day41_Inheritance.Task01;

public class Tester extends Employee {

    Tester(double salary, String name, long id, String jobTitle, char gender) {
        this.salary = salary;
        this.name=name;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;

    }

    public void reportingBug(){

        System.out.println(name+" is reporting bug.");
    }

    public void testing(){
        System.out.println(name+" is testing.");
    }
}