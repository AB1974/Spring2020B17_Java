package OfficeHours.Practice_05_13_2020;

public class Student {

    String name;
    long id;
    static String schoolName = "Cybertek";


    public String toString() {//this method is instance method because it use instance variable


        return "Name: " + name + "Id: " + id+"School name: "+schoolName;
    }

    public static void printSchoolName(){//static method accepts static
        System.out.println(schoolName+" School");
    }
}
