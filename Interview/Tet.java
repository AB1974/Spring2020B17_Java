package Interview;

class A {
    public void methodA() {
        System.out.println("MethodA");
    }
}

class B extends A {
    public void MethodB() {
        System.out.println("MethodB");
    }
}

public class Tet extends B {

    public void MethodC() {
        System.out.println("MethodC");
    }

    public static void main(String[] args) {
        A obj = new Tet();
        obj.methodA();
    }
}

