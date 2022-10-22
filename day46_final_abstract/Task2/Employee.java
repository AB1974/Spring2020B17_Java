package day46_final_abstract.Task2;

public abstract class Employee {
    /**
     * Task02:
     * 1. create an abstract class called Employee
     * attributes: name, age, gender, salary, jobTitle
     * methods:
     * abstract methods: work()
     * instance method: toString()
     * 2. create two sub classes of the Employee:
     * 1. Tester
     * 2. Developer
     * each class MUST have constructors to initialize the attributes
     */
    String name;
    int age;
    char gender;
    double salary;
    String jobTitle;

    public String toString() {

        return "Name: " + name + ", Age: " + age + " Gender: " + gender + " Salary: " + salary + " jobTitle: " + jobTitle;
    }

    public Employee(String name, int age, char gender, double salary, String jobTitle) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public abstract void work();
}

class Tester extends Employee {

    public Tester(String name, int age, char gender, double salary, String jobTitle) {
        super(name, age, gender, salary, jobTitle);
    }

    public void work() {
        System.out.println(name + " is working ");
    }

}

class Developer extends Employee {

    public Developer(String name, int age, char gender, double salary, String jobTitle) {
        super(name, age, gender, salary, jobTitle);
    }

    public void work() {
        System.out.println(name + " is working ");
    }

}

class EmployeeObjects {

    public static void main(String[] args) {
        Tester tester1=new Tester("Narsi Narasimhan",40,'M',150000.0,"Senior Tester");
        tester1.work();
        System.out.println(tester1);
        Developer devOp1=new Developer("Sana Patel",30,'F',175000.0,"Senior Developer");
        devOp1.work();
        System.out.println(devOp1);
    }
}