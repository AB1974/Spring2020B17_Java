package day34_CustomClass;

public class Tester {
    /**
     create a class called Tester
     Attributes:
     name, employeeID, JobTitle, Salary
     Actions:
     setTesterInfo(), smokeTesting(),  creatingTicket();
     create a class called Developers
     Attributes:
     name, employeeId, JobTitle, Salary
     Actions:
     setDeveloperInfo(), coding(), fixingBugs()
     create a class called ScrumTeam
     Attributes:
     name
     List of Testers,
     List of Developers,
     Actions:
     hireTester
     fireTester
     hireDeveloper
     fireDeveloper
     DailyStandUp
     create a class called BankOfAmerica:
     Bank of America in VA is planning to create a scrum teams:
     4 developers 2 testers
     create a arraylist of scrum team and:
     1. use the for loop to print out every single employees from BOA' scrum teams
     2. calculate the total budgets of the scrum team
     */
    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;


    }

    public String toString() {

        return "Name: " + name + ", EmployeeID: " + employeeID + ",Job Title: " + jobTitle + ", Salary: " + salary;
    }


}
