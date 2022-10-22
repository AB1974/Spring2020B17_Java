package day45_Exceptions;

public class Exceptions {

    public static void main(String[] args) {

        try {
           int h =3/0;
            System.out.println("try block");
        }catch (Exception e){
            System.out.println("catch block");
        }
        finally {
            System.out.println("finally");
        }



    }
}
