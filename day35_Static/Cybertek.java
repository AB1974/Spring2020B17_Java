package day35_Static;

public class Cybertek {

    String name;
    int studentID;
    double studentGPA;
    static String schoolName = "Cybertek";

    public void setInfo(String name,int studentID,double studentGPA){//instance method
        //this method can not be static because we use instance variable

        this.name=name;
        this.studentID=studentID;
        this.studentGPA=studentGPA;


    }
    public static void printSchoolName(){//we have to make static because we use static variable

        System.out.println("School name is "+schoolName);
    }

    public String toString(){

        return "Name "+name+"School Name:" +schoolName;
    }




    }


