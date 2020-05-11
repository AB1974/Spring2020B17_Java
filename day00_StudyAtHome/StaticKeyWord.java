package day00_StudyAtHome;

public class StaticKeyWord {

    int a;
    static int b ;

    public static void main(String[] args) {
        StaticKeyWord obj1 = new StaticKeyWord();
        obj1.a = 100;
        StaticKeyWord obj2 = new StaticKeyWord();
        obj2.a = 200;

        System.out.println(obj1.a);
        System.out.println(obj2.a);
        b =5000;
        System.out.println(StaticKeyWord.b);
        System.out.println(obj1.b);
        b=8000;
        System.out.println(obj2.b);

       StaticKeyWord obj3=new StaticKeyWord();
        System.out.println(obj3.a);
    }

    public static void method1() {
        System.out.println(StaticKeyWord.b);
    }

}
