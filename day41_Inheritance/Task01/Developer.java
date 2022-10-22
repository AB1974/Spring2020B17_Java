package day41_Inheritance.Task01;

import day41_Inheritance.Task01.Employee;

public class Developer extends Employee {

    Developer(double salary, String name, long id, String jobTitle, char gender) {
        this.salary = salary;
        this.name=name;
        this.id=id;
        this.jobTitle=jobTitle;
        this.gender=gender;

    }
    public void fixingBug(){

        System.out.println(name+" is fixing bug.");
    }

    public void coding(){
        System.out.println(name+" is coding.");
    }
}
