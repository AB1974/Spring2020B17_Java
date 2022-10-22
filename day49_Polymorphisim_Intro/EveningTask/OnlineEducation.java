package day49_Polymorphisim_Intro.EveningTask;

import day20_Arrays02.Students;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Task01:
 * 1. create an interface named onlineEducation
 * variable: boolean onlineStudent
 * abstract methods: attendClass();
 * 2. create an interface named Cybertek that can inherit from OnlineEducation
 * variable: schoolName, requiresITBackGround
 * 3. create an class named Student that can inherit from  onlineEducation and CybertekSchool
 * private variables: studentName, age, grade, has_ITBackGround
 * encapsulate all private variables
 * actions: studying(), takingBreaks(), toString()
 * 4. create a class named CybertekSchool
 * create 5 objects of students and set your classmates' info
 * create a list of Cybertek and store all student objects
 * iterate the list to display the full information of students
 */
interface OnlineEducation {
    boolean onlineStudent = true;

    void attendClass();

}

interface Cybertek extends OnlineEducation {

    boolean requiresITBackGround = false;
    String schoolName = "Cybertek";

}

class Student implements Cybertek, OnlineEducation {
    private String studentName;
    private int age;
    private char grade;
    private boolean has_ITBackGround;

    public Student(String studentName, int age, char grade, boolean has_ITBackGround) {
        setStudentName(studentName);
        setAge(age);
        setGrade(grade);
        setHas_ITBackGround(has_ITBackGround);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public boolean isHas_ITBackGround() {
        return has_ITBackGround;
    }

    public void setHas_ITBackGround(boolean has_ITBackGround) {
        this.has_ITBackGround = has_ITBackGround;
    }

    @Override
    public void attendClass() {
        System.out.println("Name is attending onlineclass " + schoolName);


    }

    public void studying() {
        System.out.println(studentName + " is studying");
    }

    public void takingBreak() {
        System.out.println(studentName + " is taking break");
    }

    public String toString() {

        return "Student Name: " + studentName + " Student Age: " + age + " Student Grade: " + grade + "IT Backround: " + has_ITBackGround+"\n";
    }


}

class CybertekSchool {
    public static void main(String[] args) {
        Student student1 = new Student("Desara",30,'A',true);
        Student student2 = new Student("Nahide",30,'A',false);
        Student student3 = new Student("Kaisar",30,'A',true);
        Student student4 = new Student("Soulemani",30,'A',false);
        Student student5 = new Student("Izzetullah",30,'A',true);

        ArrayList<Student>CybertekList=new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5));
        System.out.println(CybertekList);

    }

}