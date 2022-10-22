package QuizAbstraction;

public interface Interface_Test {
    public static void method1() {
        System.out.println("static method");
    }

    // public void method2() {//interface can not have instance methods
    //     System.out.println("instance method");}


    public abstract void method3();

    public void method4();

    // private int num=25;
    public static void main(String[] args) {
        //  Interface_Test obj=new Interface_Test();
      //  System.out.println(obj.num);
    }


}
