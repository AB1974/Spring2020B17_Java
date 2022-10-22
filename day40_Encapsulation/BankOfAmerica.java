package day40_Encapsulation;


public class BankOfAmerica {

    public static void main(String[] args) {

        EmployeeInfo ABDUL = new EmployeeInfo();

        System.out.println(ABDUL.getAddress());

        ABDUL.setAddress("VIRGINIA");
        System.out.println(ABDUL.getAddress());
        System.out.println(ABDUL.companyName);

        System.out.println(ABDUL.getSalary());
        ABDUL.setSalary(140000.50);
        System.out.println(ABDUL.getSalary());
    }

}
