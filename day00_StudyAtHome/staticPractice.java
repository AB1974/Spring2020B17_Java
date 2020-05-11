package day00_StudyAtHome;

public class staticPractice {

    public static void main(String[] args) {

        staticPractice obj1=new staticPractice();

        obj1.method2();
        staticPractice.method1();
    }
    public void method2(){
        System.out.println("instance method");

    }


    public static void method1(){
        System.out.println("static method");

    }

}
