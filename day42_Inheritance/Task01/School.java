package day42_Inheritance.Task01;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * create a class called school:(no extension of any class!)
 * create 3 objects of student and set their info
 * create a an ArrayList of students to store all student objects (Array List only supports objects)
 * use for each loop to print out each students' name and studentID
 */
public class School {

    public static void main(String[] args) {//School has a relation with student class
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo( "bahtiyar", 35,'M',2345,"testing");
        student2.setStudentInfo( "abide", 32,'F',2378,"art" );
        student3.setStudentInfo( "byakl", 10,'M',2309,"soccer");



        ArrayList<Student>studentList=new ArrayList<>();//ArrayList only accept objects!

        studentList.addAll(Arrays.asList(student1,student2,student3));

        for(Student each:studentList){

          //  System.out.println(each);
            System.out.println("Name: "+each.name+",ID: "+each.studentID);
        }
    }


}
