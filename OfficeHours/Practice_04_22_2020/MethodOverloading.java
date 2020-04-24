package OfficeHours.Practice_04_22_2020;

public class MethodOverloading {


    public static void main(String[] args) {
        method1();
        method1(10);
        method1(10.0);

        int num1=method1(10);
        System.out.println(num1);
    }
    public static void method1(){
        System.out.println("Hello world");
    }

    public static int method1(int a){
        System.out.println("hello cybertek");
        return 10;

    }
    public static void method1(double a){
        System.out.println("hellp Batch 18");

    }
}
