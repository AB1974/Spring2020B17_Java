package day36_StaticBlock;

public class HumanResources1 {
    /**
     * 2. create a class called HumanResources
     * declare 5 variables of Employee as static
     * use static block to:
     * 1. initialize those static variables
     * 2. set all the info of the Employees
     */
    static Employee employee1=new Employee();
    static Employee employee2=new Employee();
    static Employee employee3=new Employee();
    static Employee employee4=new Employee();
    static Employee employee5=new Employee();


    static {

        employee1.setEmployeeInfo("JANE",123,456765,"PO",200000,'F');
        employee2.setEmployeeInfo("JIMMY",321,456654,"BA",200000,'M');
        employee3.setEmployeeInfo("JOHN",1234,456564,"SM",130000,'M');
        employee4.setEmployeeInfo("NICK",1235,456654,"Tester",120000,'M');
        employee5.setEmployeeInfo("NORAH",1236,456567,"Developer",140000,'F');


    }

}
