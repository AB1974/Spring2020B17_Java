package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2() {
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a) {
        this();//default constructor//
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str) {
      this(10);
        System.out.println("Constructor with string argument");
        //this(10);
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2("Hello");
    }

    public void method() {
        // ConstructorCalls2();you can not call in somewhere else it has to be another constructor.
        //in order to call you need to use this(); word.
    }

}
