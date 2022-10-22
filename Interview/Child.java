package Interview;

class Parent {

    public void method1() {
        System.out.println("method1");
    }
}

public class Child extends Parent {
    public void method2() {
        System.out.println("method2");
    }

    public static void main(String[] args) {
        //  Child obj = new Parent(); compile error
        Parent obj = new Child();
        obj.method1();
        // obj.method2(); compile error

    }
}

