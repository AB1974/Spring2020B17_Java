package day45_Exceptions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class summary {
    public static void main(String[] args) {

        // Thread.sleep(3000);


        try {
            throw new IOException();  // checked

        } catch(Exception e){

        }


        System.out.println("Hello");

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (RuntimeException a){

        }




        try {
            throw new ClassNotFoundException();
        } catch (Exception e ){

        }



        try {
            throw new NullPointerException();

        }catch(ArithmeticException a ){
            System.out.println("Arithmetic");

        }catch(ClassCastException a){
            System.out.println("Class Cast");

        }catch(RuntimeException a){
            System.out.println("Runtime");

        }catch (Exception e){
            System.out.println("Exception");

        }finally{
            System.out.println("Finally Block");
        }

        System.out.println("==========================================");

        try {
            throw new ArithmeticException();
        } catch(NoSuchElementException e){
            System.out.println("No such element");
        }finally {
            System.out.println("Finally Block 2");
        }


        //  System.out.println("Completed");






    }


    public static void method1() throws Exception {
        throw new FileNotFoundException();
    }

    public static void method2(){
        try {
            method1();
        } catch (Exception e){

        }
    }


    public static void method3(){
        method2();
        //  method1();
    }






}