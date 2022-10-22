package Interview;

class Employee {

    public int salary;
}
class Manager extends Employee{

    public int budget;
}

class Director extends Manager{
    public int stockOptions;
}

class test{
    public static void main(String[] args) {
        Employee employee=new Employee();
        Manager manager=new Manager();
        Director director=new Director();
        director.salary=80000;
        employee.salary=50000;
       // manager.stoc
        director.stockOptions=1000;
        manager.budget=100000;
    }
}