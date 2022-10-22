package day47_Abstraction;

abstract class A {//super class

    public abstract void method1();//abstract method

    public void method2() {
    }//regular method no need to override in sub class !
}


public class Abstract_VS_NonAbstract2 extends A {//sub class ( regular )
    //its mandatory to override the abstract method of A
    //2 methods is here one from A class one is below!

    @Override
    public void method1() {

    }

}

abstract class B extends A {//sub class//its optional override abstract method of A
    //one abstract
    //one instance  because its extending from class A


}

class C extends B {
    @Override
    public void method1() {

    }

}