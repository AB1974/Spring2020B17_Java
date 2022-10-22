package day39_AccessModifiers;

/**
 * 2. create a class called Employee:
 * instance variables:
 * name, jobTitle, ID, salary
 * add a constructor that can initialize name of employee
 * add a constructor that can initialize name, jobTitle of the employee
 * (apply constructor call to initialize the name)
 * add a constructor that can initialize name, jobTitle, ID of the employee
 * (apply constructor call to initialize the name and jobTitle)
 * add a constructor that can initialize name, jobTitle, ID, salary of employee
 * (apply constructor call to initialize the name, jobTitle, ID)
 * add toString method
 */
public class Employee {//below variables instance variables
    static String companyName = "BankOfAmerica";//static variable because it's common
    String name;
    String jobTitle;
    long id;
    double salary;
    char gender;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle) {
        this(name);//we are calling first constructor here
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, long id) {
        this(name, jobTitle);//we are calling second constructor here
        this.id = id;
    }

    public Employee(String name, String jobTitle, long id, double salary) {
        this(name, jobTitle, id);//we are calling third constructor here
        this.salary = salary;
    }

    public Employee(String name, String jobTitle, long id, double salary, char gender) {
        this(name, jobTitle, id, salary);//we are calling fourth constructor here
        this.gender = gender;

    }

    public String toString() {

        return "Name: " + name + " id: " + id + " jobTitle: " + jobTitle + " salary: " + salary + " gender: " + gender+"Company name is :"+companyName;
    }

}
