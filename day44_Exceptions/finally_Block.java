package day44_Exceptions;

public class finally_Block {

    public static void main(String[] args) {


        try {
            System.out.println(9 / 0);
            System.out.println("Try Block");
        } catch (Exception e) {
            System.out.println("Catch Block");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
