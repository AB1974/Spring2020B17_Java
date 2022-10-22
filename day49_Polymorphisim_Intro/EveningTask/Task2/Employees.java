package day49_Polymorphisim_Intro.EveningTask.Task2;

import day49_Polymorphisim_Intro.Employee;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * task02:
 * 1. create an abstract class named Employees
 * private variables: employeeName, employeeId, salary, ssn, JobTiTle, isFullTime, hasPTO
 * encapsulate all private variables
 * abstract methods: work(), meeting()
 * instance Methods: toString()
 * 2. create an interface named ScrumTeam
 * variable: has_ScrumMaster
 * abstract methods: dailyStandUp()
 * 3. create an interface named WorkRemotely
 * abstract method: workFromHome();
 * 4. create a final class named Tester that can inherit Employees, ScrumTeam, and WorkRemotely
 * actions: findingBug(), creatingTicket()
 * 5. create a final class named Developer that can inherit Employees, ScrumTeam, and WorkRemotely
 * set a constructor that can initialize fileds (instance variables)
 * 6. create a class named AppleInc:
 * create 2 Tester' and 3 Developer' objects
 * create a list of ScrumTeam and store all Tester's and Developer's objects
 * Iterator the list of scrum team to diplay the informations of the full time employees
 */
public abstract class Employees {

    private String employeeName;
    private long employeeId;
    private double salary;
    private long ssn;
    private String jobTitle;
    private boolean isFullTime;
    private boolean hasPTO;

    public Employees(String employeeName,long employeeId,double salary,long ssn,String jobTitle,boolean isFullTime,boolean hasPTO) {
        setEmployeeName(employeeName);
        setEmployeeId(employeeId);
        setSalary(salary);
        setSsn(ssn);
        setJobTitle(jobTitle);
        setFullTime(isFullTime);
        setHasPTO(hasPTO);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public boolean isHasPTO() {
        return hasPTO;
    }

    public void setHasPTO(boolean hasPTO) {
        this.hasPTO = hasPTO;
    }

    abstract void work();

    abstract void meeting();


    public String toString() {
        return "   employee name: " + employeeName + " employee id: " + employeeId + " salary: " + salary + " ssn: " +
                ssn + " JobTitle: " + jobTitle + " is full time: " + isFullTime + " has PTO " + hasPTO+"\n";
    }

}

interface ScrumTeam {
    boolean has_ScrumMaster = true;

    void dailyStandUP();
}

interface WorkRemotely {

    void workFromHome();
}

class Tester extends Employees implements ScrumTeam, WorkRemotely {

    public Tester(String employeeName,long employeeId,double salary,long ssn,String jobTitle,boolean isFullTime,boolean hasPTO) {
        super(employeeName,employeeId,salary,ssn,jobTitle,isFullTime,hasPTO);

    }

    @Override
    void work() {
        System.out.println(getEmployeeName() + " is testing");
    }

    @Override
    public void workFromHome() {
        System.out.println(getEmployeeName() + " is working from home");
    }

    @Override
    public void dailyStandUP() {
        System.out.println(getEmployeeName() + " is attending daily standUp meeting everyday");
    }

    @Override
    void meeting() {
        System.out.println(getEmployeeName() + " is at Sprint Planning Meeting ");
    }

    void findingBug() {
        System.out.println(getEmployeeName() + " is finding  bug ");

    }

    void creatingTicket() {
        System.out.println(getEmployeeName() + " is creating bug ticket ");
    }
}

class Developer extends Employees implements ScrumTeam, WorkRemotely {

    public Developer(String employeeName,long employeeId,double salary,long ssn,String jobTitle,boolean isFullTime,boolean hasPTO) {
       super(employeeName,employeeId,salary,ssn,jobTitle,isFullTime,hasPTO);
    }

    @Override
    void work() {
        System.out.println(getEmployeeName() + " is coding");
    }

    @Override
    public void workFromHome() {
        System.out.println(getEmployeeName() + " is working from home");
    }

    @Override
    public void dailyStandUP() {
        System.out.println(getEmployeeName() + " is attending daily standUp meeting everyday");
    }

    @Override
    void meeting() {
        System.out.println(getEmployeeName() + " is at Sprint Planning Meeting ");
    }


}

class AppleINC {
    public static void main(String[] args) {

        Employees tester1 = new Tester("Narsi", 123456, 130000, 4565733, "SDET", false, true);
        Employees tester2 = new Tester("Raj", 1234567, 140000, 45676336, "QA", false, false);
        Employees developer1 = new Developer("Aylin", 1834567, 180000, 45673836, "Developer", true, true);
        Employees developer2 = new Developer("Ali", 1934567, 145000, 45673836, "Developer", true, false);
        Employees developer3 = new Developer("Ayse", 1904567, 160000, 45678033, "Developer", true, false);

        ArrayList<Employees> ScrumList = new ArrayList<>(Arrays.asList(tester1,tester2,developer1,developer2,developer3));
        System.out.println(ScrumList);
    }



}