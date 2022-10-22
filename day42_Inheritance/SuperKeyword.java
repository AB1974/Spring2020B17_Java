package day42_Inheritance;

class A {//parent class

    int a = 100;

    public A(double b) {//constructor
        System.out.println(this.a);//100
    }

}

public class SuperKeyword extends A {

    int a = 200;

    public SuperKeyword() {//constructor

        super(10.5);//100
        System.out.println(super.a);//100//calling instance method /instance variable from super class
    }

    public static void main(String[] args) {

         A obj1=new A(10.0);//100

        System.out.println("==============");

        SuperKeyword obj2=new SuperKeyword(); //100//100
    }

}
