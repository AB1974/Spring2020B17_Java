package day50_polymorphism.OOPReview;
interface I{
    void method2(); // public abstract
    abstract int method3();

    //  public I(){}
    //  public void m(){ }
    // {  }
    //  static { }

    int a = 1000;  // public static final

    public static void main(String[] args) {
        System.out.println(a);
        // a = 2000;

    }

}

abstract class A{
    {

    }

    static{

    }

    public A(){

    }

    protected abstract void method1();
    public void method4(){ }

}

interface I2{

}

public class Abstraction extends A  implements I, I2{

    @Override
    public  void method1(){

    }


    @Override
    public void method2() {

    }

    @Override
    public int method3() {
        return 0;
    }


}