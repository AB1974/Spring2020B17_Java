package OfficeHours.Practice_05_27_2020;

public class MethodOverloading {

    public void method(){

    }

    private String method(int a){
        return "123";
    }

    public static void method2(){

    }

    public static int method2(int a){
        return 123;
    }

    public MethodOverloading(){

    }

    public MethodOverloading(int a){

    }

    public MethodOverloading(int a, int b){

    }


    public static void main(String[] args) {//main method can be overloaded but compiler recognise main method
        System.out.println("String");
    }

    public static void main(int a) {
        System.out.println("int");
    }




}