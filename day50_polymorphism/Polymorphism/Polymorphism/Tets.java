package day50_polymorphism.Polymorphism.Polymorphism;

public class Tets {

    public static void main(String[] args) {

        ChildA cha = new ChildA();
        cha.m1();
        cha.m2();
        cha.m3();

        ChildB chb = new ChildB();
        chb.m1();
        chb.m2();
        chb.m4();

        Parent p1 = new ChildA();
        p1.m1();//Polymorphism

        Parent p2 = new ChildB();
        p2.m1();//polymorphism

        MyInterface int1=new ChildA();
        int1.m2();

        MyInterface int2=new ChildB();
        int2.m2();


    }
}
