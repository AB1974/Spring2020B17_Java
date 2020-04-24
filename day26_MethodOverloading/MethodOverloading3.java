package day26_MethodOverloading;

public class MethodOverloading3 {
    //multiple methods sharing the same name!
    //Parameter must be different (either the datatype or number of parameters MUST be different//
    //benefit :easy to read and its reusable,its easy to memorize,very flexible!


    public static void main(String[] args) {


        method(10);//original method
        method(10, 30);
        method(10.0);//overloaded method double
    }

    public static void method(int a) {

        System.out.println("Original method");

    }

    public static void method(int a, int b) {//We are overloading

        System.out.println("overloaded method two parameters");

    }

    public static void method(double a) {//Another way //We are overloading

        System.out.println("overloaded method double ");

    }



}
