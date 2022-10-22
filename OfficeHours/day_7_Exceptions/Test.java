package OfficeHours.day_7_Exceptions;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{

            String s = "abc";
            System.out.println(s.charAt(2));
            int [] a = new int[3];
            System.out.println(a[50]);

            //   Exception obj = new RuntimeException();

        } catch (StringIndexOutOfBoundsException  | ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bounds");
        } catch (Exception e) {
            System.out.println("general exception");
        } finally {
            input.close();
            System.out.println("finally block");
        }

    }
}
