package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3() {
        //this(9);//int argument
        System.out.println("default");
        // this(9);//this has to be in the first step!!!!!!! do not forget

    }

    public ConstructorCalls3(int a) {
        this();
        System.out.println("Int argument");
    }

    public ConstructorCalls3(String str) {
        this(10);
        //this("Aylin");//constructor can not call another constructor
    }

    public void method1() {
        //this();
        method1();//method call itself
    }

    public static void main(String[] args) {

        new ConstructorCalls3();//default constructor
    }
}
