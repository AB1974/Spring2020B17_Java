package day47_Abstraction;

class Test1 {//REGULAR CLASS
    /**
     * YOU CAN  CREATE OBJECT!!
     * CAN BE FINAL
     */
    public Test1() {}//constructor //MANDATORY but it gives default
    public void method1() {} // custom method
    public static void method2(){}//static method
   //public abstract void method3();//you can not have abstract method in regular class.It has to be abstract class!
    int a =100;//instance variable
    static int b=200;//static variable
    {
        //instance block
    }
    static{
        //static block
    }
}

abstract class Test2 {//ABSTRACT CLASS

    /**
     * YOU CAN NOT CREATE OBJECT!!!!IN ABSTRACT CLASS
     * CANNOT BE FINAL
      */
    public Test2() {}//constructor
    public void method1() {} // custom method
    public static void method2(){}//static method
    public abstract void method3();//abstract method++++++++PLUS +++++
    int a =100;//instance variable
    static int b=200;//static variable
    {
        //instance block
    }
    static{
        //static block
    }


}

public class Abstract_VS_NonAbstract {


}
