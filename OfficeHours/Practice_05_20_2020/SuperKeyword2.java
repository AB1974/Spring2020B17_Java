package OfficeHours.Practice_05_20_2020;

class TestData {
    int num = 1000;//instance variable
    String name = "Cybertek";//instance variable

    public void method() {
        System.out.println("Cybertek S");//instance method
    }
}

public class SuperKeyword2 extends TestData {
    int a = 200;
    String name = "MIT";

    public void method() {
        System.out.println("MIT SChool");
    }

    public SuperKeyword2(){
        super.method();
        System.out.println(this.a);//local variable
        System.out.println(super.name);//super. name from superclass

    }

    public static void main(String[] args) {
        SuperKeyword2 obj=new SuperKeyword2();
    }

}
