package day47_Abstraction;

public class Student {


        String firstName;
        String lastName;

        Student(String firstName, String lastName){

            this.firstName = firstName;
            this.lastName = lastName;

        }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args){
        Student student = new Student("John", "Doe");

        System.out.println(student.firstName);


    } }