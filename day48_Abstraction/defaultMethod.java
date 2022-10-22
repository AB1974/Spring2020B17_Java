package day48_Abstraction;

abstract class T {


}

public interface defaultMethod {

    default void method() {
        System.out.println("Default Method");
    }

    public static void main(String[] args) {
        //  method();
        //  defaultMethod obj= new defaultMethod() ;

    }

}

class N implements defaultMethod {
    public static void main(String[] args) {
        N obj = new N();
        obj.method();
    }
}
