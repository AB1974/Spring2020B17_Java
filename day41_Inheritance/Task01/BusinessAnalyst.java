package day41_Inheritance.Task01;


public class BusinessAnalyst extends Employee {

    BusinessAnalyst(double salary, String name, long id, String jobTitle, char gender) {
        this.salary = salary;
        this.name=name;
        this.id=id;
        this.jobTitle="Business Analyst";
        this.gender=gender;

    }
    public void writingRequirements(){

        System.out.println(name+" is writing requirements");
    }
    public void gathering(){
        System.out.println(name+" gathering all necessary documents from customer");

    }

}
