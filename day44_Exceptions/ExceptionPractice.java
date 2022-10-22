package day44_Exceptions;

public class ExceptionPractice {

    public static void main(String[] args) {

        try {// it's not preferred!
            System.out.println("Test 1");
            System.out.println("Test 2");
            System.out.println("Test 3");
            System.out.println(9/0);
            System.out.println("Test 4");//this will not be printed

        } catch (Exception e) {

        }

    }
}
