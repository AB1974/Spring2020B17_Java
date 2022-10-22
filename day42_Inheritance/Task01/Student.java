package day42_Inheritance.Task01;

/**
 * create a subclass of Person called Student
 * attributes: name, age, gender, studentID, clazz
 * methods: attendClass, code, setStudentInfo, toString
 */
public class Student extends Person {
    /**
     * name (inherited)
     * age (inherited)
     * gender (inherited)
     * schoolName==Cybertek University
     * studentID==
     * clazz==
     * setPersonInfo() (inherited)
     * eat(), sleep(),walk(),drink() inherited
     * setStudentInfo()
     * attendClass()
     * code()
     * toString()
     */
    public long studentID;
    public String clazz;
    public static String schoolName = "Cybertek";

    public void setStudentInfo(String name, int age, char gender, long StudentID, String clazz) {
        setPersonInfo(name, age, gender);
        this.studentID = StudentID;
        this.clazz = clazz;
    }

    public void attendClass() {

        System.out.println(name + " is attending " + clazz);
    }

    public void code() {

        System.out.println(name + " is coding  ");
    }

    public String toString() {

        return "Student name: " + name + " Age: " + age + " Gender: " + gender
                + " Student ID: " + studentID + " Class: " + clazz+" "+schoolName;
    }
}
