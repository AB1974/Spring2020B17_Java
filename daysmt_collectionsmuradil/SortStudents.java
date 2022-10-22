package daysmt_collectionsmuradil;
import java.util.*;
public class SortStudents {


        public static void main(String[] args) {


            Student st2 = new Student(10, "Ibrahim");
            Student st3 = new Student(1, "Ivan");
            List<Student> stList = new ArrayList<>();

            stList.add(new Student(300, "Roman"));
            stList.add(new Student(87, "Ibo"));
            stList.add(new Student(89, "Ali"));
            stList.add(new Student(1, "Arzu"));
            stList.add(new Student(10, "Ahmet"));
            stList.add(new Student(101, "Mehmet"));


            System.out.println(stList.toString());

           Collections.sort(stList);
            System.out.println(stList.toString());




        }
    }

