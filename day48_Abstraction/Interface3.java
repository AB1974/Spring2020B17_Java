package day48_Abstraction;

public interface Interface3 {

    int num = 100;//by default is public static final (if there is interface)
    int num2=300;

    public void method1();

    public abstract void method2();

    static void method3() {

    }



    public static void main(String[] args) {

        Interface3.method3();
        System.out.println(num2);

    }


}
