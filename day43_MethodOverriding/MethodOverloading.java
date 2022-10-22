package day43_MethodOverriding;

public class MethodOverloading {
    //method overloading :same method name different parameter
    //method overriding: same method name same parameter It must take place in sub class !
    //method overriding : to implement different different functions!
    //@Override if this annotation is yellow applicable means the method is overridden method if it does not compile means not
    //static method and constructor CAN NOT BE OVERRIDING
    //ONLY instance  method CAN BE OVERRIDING
    public void method() {

    }

    public int method(int a) {
        return a;
    }
}
