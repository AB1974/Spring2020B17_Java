package day43_MethodOverriding;
//method overloading :same method name different parameter
//method overriding: same method name same parameter It must take place in sub class !
//method overriding : to implement different different functions!
//static method and constructor CAN NOT BE OVERRIDING
//ONLY instance  method CAN BE OVERRIDING
//public ==>protected==>default==>private (you can change access modifier when you override it has to be more visible)
class Test {

    public void method() { //this is super class
        System.out.println("Onur");
    }
}

public class MethodOverriding extends Test { //This is sub class

    @Override
//if this annotation is yellow applicable means the method is overridden method if it does not compile means not
    public void method() { // we overrided above method same method name, same parameter,same return type different function
        System.out.println("Zarina");
    }


    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.method();//Onur

        MethodOverriding obj2 = new MethodOverriding();
        obj2.method();//Zarina

    }


}
