package day44_Exceptions;

public class try_catchBlocks2 {

    public static void main(String[] args) {

        System.out.println("hello");

        try{
            Thread.sleep(1000);
            System.out.println("try block");
        }catch (Exception e){
            System.out.println("cathc block");
        }
        System.out.println("World");
    }
}
