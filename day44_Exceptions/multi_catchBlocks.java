package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {
    public static void main(String[] args) {

        try {
            System.out.println(100 / 0);//unchecked error runtime error
        } catch (ClassCastException e) {
            System.out.println("Class Cast");

        }catch(NoSuchElementException e){//child class
            System.out.println("No such element");
        }catch(IndexOutOfBoundsException e){//child class
            System.out.println("IndexOutOfBounds");
        }catch(ArithmeticException e){//child class
            System.out.println("Arithmetic Exception");
        }catch (RuntimeException e){//parent exception class//it has to come at the end
            System.out.println("Runtime exception");
        }catch(Exception e){
            System.out.println("exception");
        }
    }
}
