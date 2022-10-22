package day38_Constructors;

public class Test {

    public Test() {


        System.out.println("constructor");
    }

    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");//instance block depend on creating object
    }

    public static void main(String[] args) {


        new Test();
        System.out.println("Main method");
    }


}
