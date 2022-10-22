package OfficeHours.Practice_05_20_2020;

class Data {
    int a = 100;

    public void method() {
        System.out.println("Hello world");
    }
}

public class SuperKeyword extends Data {

    int a = 200;

    public void method() {
        System.out.println("Hello Cybertek");
    }

    public SuperKeyword() {
        super.method();
        System.out.println(super.a);//calling instance methods and instance variable from super class

    }

    public static void main(String[] args) {
        SuperKeyword obj = new SuperKeyword();
    }
}