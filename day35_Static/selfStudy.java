package day35_Static;

public class selfStudy {

    int iv=100;

    static int b = 10;


    public static void main(String[] args) {

        selfStudy obj1 = new selfStudy();
        obj1.iv = 6;

        System.out.println(obj1.iv);
        System.out.println(obj1.b);

        selfStudy obj2 = new selfStudy();
        obj2.iv = 20;

        System.out.println(obj2.iv);
        System.out.println(obj2.b);


    }

    void test1() {

        System.out.println("hello world");

    }

}
