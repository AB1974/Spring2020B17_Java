package day41_Inheritance.Task01;


public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester1 = new Tester(130000, "Aylin ", 123456, "SDET", 'F');
        System.out.println(tester1);
        tester1.reportingBug();
        tester1.testing();
        Developer developer1 = new Developer(150000, "Aylin", 456789, "Senior Developer", 'F');
        System.out.println(developer1);
        developer1.fixingBug();
        developer1.coding();
        BusinessAnalyst BA1 = new BusinessAnalyst(200000, "Aylin", 345123, "BA", 'F');
        System.out.println(BA1);
        BA1.writingRequirements();
        BA1.gathering();
    }


}
