package QuizAbstraction;
class Parent{
    public void method1(){
        System.out.println("method");
    }
}
public class Child extends Parent{

    public void method2(){
        System.out.println("method2");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.method2();
        obj.method1();
    }
}
