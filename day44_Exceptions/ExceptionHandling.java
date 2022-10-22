package day44_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str = "Cybertek";
        try {
            System.out.println(str.charAt(400));
        } catch (RuntimeException e) {
            String description = e.getMessage();//we are calling instance method from Exception class
            System.out.println(description);
        }
        System.out.println("Completed");

        System.out.println("=======unchecked===its going to jump catch block=======");
        try {
            System.out.println(10 / 0);

        } catch (ArithmeticException e) {
            String description = e.getMessage();
            System.out.println(description);
        }
        System.out.println("completed");

    }
}
