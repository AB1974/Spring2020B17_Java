package OfficeHours.Practice_05_13_2020;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "oguz";
        student1.id=123;

        Student student2 = new Student();
        student2.name = "Ayse";
        student2.id=456;

        student1.schoolName="Harvard";
        System.out.println(student1);//ayse
        System.out.println(student2);//ayse if variable is static there is only 1 copy

    }

}
