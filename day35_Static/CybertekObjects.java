package day35_Static;

public class CybertekObjects {

    /**
     *   /*
     *     create a custom class called student
     *             Attribute:
     *                 name, id, gpa,
     *                 SchoolName = "Cybertek";
     *             actions:
     *                 setInfo(): name, id, gpa
     *                 printSchoolName():
     *                 toString():
     *      */


    public static void main(String[] args) {


        Cybertek student1=new Cybertek();
        student1.name="Muhtar";
        System.out.println(student1);

        Cybertek student2=new Cybertek();
        student2.name="Kuzat";
        System.out.println(student2);

        System.out.println("================");
        Cybertek.printSchoolName();//this static method comes through the class name!



    }



}
