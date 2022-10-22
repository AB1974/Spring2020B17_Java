package day42_Inheritance;


class Test {

    public Test(int a) {//parent class or super class
        this(2.5);
        System.out.println("A");
    }
    public Test(double a ){
        System.out.println("C");
    }
}

public class Constructor2 extends Test { //sub class

    public Constructor2() {
        super(10);//this constructor calling constructor from super class!
        //at least one constructor from parent class has to be called from sub class otherwise it does not compile.
        System.out.println("B");
    }

    public static void main(String[] args) {

       Test obj1 = new Test(10);//A
     //   Constructor2 obj2=new Constructor2();//A,B

    }
}
