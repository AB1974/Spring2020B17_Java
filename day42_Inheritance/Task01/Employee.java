package day42_Inheritance.Task01;

/**
 * create a sub class of person called Employee
 * attributes: name, age, gender, Salary, employeeID, jobTitle
 * methods: work, setEmployeeInfo, toString
 */
public class Employee extends Person {
/**
 * name inherited
 * ,age inherited
 * gender inherited
 * setPersonInfo inherited
 * eat ()inherited instance method
 * sleep() inherited instance method
 * walk() inherited
 * drink ()inherited
 * salary ==
 * employee ==
 * jobtitle==
 * setEmployeeInfo()
 * work()
 * toString()
 */

public double salary;
public long employeeID;
public String jobTitle;

public void setEmployeeInfo(String name,int age,char gender,double salary,long employeeID,String jobTitle){
    setPersonInfo(name,age,gender);
    this.employeeID=employeeID;
    this.jobTitle=jobTitle;
    this.salary=salary;

}
public void work(){
    System.out.println(name+" is working");
}
public String toString (){
    return "Employee name: "+name+"\nAge: "+age+"\nGender: "+gender
            +"\nJob Title: "+jobTitle+"\nSalary: "+salary+"\nEmployee ID: "+employeeID;
}
}
