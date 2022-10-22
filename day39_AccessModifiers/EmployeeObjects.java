package day39_AccessModifiers;

public class EmployeeObjects {

    public static void main(String[] args) {
        Employee employee1=new Employee("Aylin");
        System.out.println(employee1);

        Employee employee2=new Employee("Aylin","QA");
        System.out.println(employee2);

        Employee employee3=new Employee("Aylin","QA",123);
        System.out.println(employee3);

        Employee employee4=new Employee("Aylin","QA",123,140000);
        System.out.println(employee4);

        Employee employee5=new Employee("Aylin","QA",123,140000,'F');
        System.out.println(employee5);

    }
}
