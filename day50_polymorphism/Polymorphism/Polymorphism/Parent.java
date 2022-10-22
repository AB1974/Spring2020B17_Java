package day50_polymorphism.Polymorphism.Polymorphism;

public class Parent {

    public void m1() {
    }
}

interface MyInterface {
    public abstract void m2();
}

class ChildA extends Parent implements MyInterface {

    public void m2() {
    }

    public void m3() {
    }
}

class ChildB extends Parent implements MyInterface {

    public void m2() {
    }

    public void m4() {
    }
}

