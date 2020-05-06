package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsObject {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setStudentInfo("Adam", "England", 34, 3.5, 'M', true);

        System.out.println(student1);

        Student student2 = new Student();

        student2.setStudentInfo("Mike", "German", 30, 3.0, 'M', false);
        System.out.println(student2);

        Student student3 = new Student();
        student3.setStudentInfo("Johnny Guitar", "US", 40, 2.5, 'M', false);

        Student student4 = new Student();
        student4.setStudentInfo("Anna", "Ukrainian", 33, 3.9, 'F', true);

        Student[] students = {student1, student2, student3, student4};

        ArrayList<Student> canGraduate = new ArrayList<>(Arrays.asList(students));
        System.out.println(canGraduate.size());//there are 4 students
        canGraduate.removeIf(p -> p.gpa <= 3.0);//2


        for (int i = 0; i < canGraduate.size(); i++) {
            Student each = canGraduate.get(i);
            System.out.println(each.name + " can graduate");
        }
        System.out.println("===============");
        ArrayList<Student> canNotGraduate = new ArrayList<>(Arrays.asList(students));
        canNotGraduate.removeIf(p -> p.gpa > 3.0);
        System.out.println(canNotGraduate.size());

        for(Student each:canNotGraduate){
            System.out.println(each.name+" can not graduate");
        }
    }
}
