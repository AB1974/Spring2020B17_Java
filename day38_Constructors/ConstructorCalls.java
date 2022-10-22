package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls() {
        method1();
        method2();
    }

    public ConstructorCalls(int a) {

        this();//this is for calling constructor
    }

    public static void method1() {//static method

    }

    public void method2() {//custom method
        method1();
    }

}
