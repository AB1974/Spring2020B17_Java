package day48_Abstraction;

interface A1 {

    void method1();//access modifier is public
}

interface B1 {
    abstract int method2();//access modifier is public
}

interface C1 {
    public abstract void method3();
}

public class Abstraction02 implements A1, B1, C1 {// a class can implements multiple interfaces at the same time !

    public void method1() {

    }

    public int method2() {

        return 10;
    }

    public void method3() {

    }
}
