package day48_Abstraction;


public interface Interface2 {

    //  public Interface2(){ }

    // public void method1(){ }

    // { }
    public int a = 100;//interface variables by default static and final !!!!!!!!


    public static void main(String[] args) {

        System.out.println(a);//by default static
        //a=200;//by default final

        System.out.println(Interface2.a);//static variable !we can call it through Interface2
        Interface2.method4();

    }

    static void method4() {//by default public

    }

    void method5();//public abstract is default

    default void method6() {//special method it is only allow to use lambda expression.
        System.out.println("Default method");
    }

}
