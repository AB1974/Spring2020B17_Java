package day36_StaticBlock;

public class Employee {
    /**
     * 1. Create a class called Employee
     * 			instance variables:
     * 					name, id, ssn, jobTitle, salary, gender
     * 			actions:
     * 					setEmployeeInfo(): can initialize all the instance variables
     * 					toString(): can return the info of the employee as string
     */

    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setEmployeeInfo(String name,int id,int ssn,String jobTitle,double salary,char gender){

        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.gender=gender;


    }
    public String toString(){

        return "Name: "+name+" id: "+id+" ssn: "+ssn+" job Title: "+jobTitle+" salary: "+salary+" gender: "+gender;
    }


}
