package day35_Static;

public class staticMethod {

    int a = 100;
    static int b=200;

    public static void main(String[] args) {


        staticMethod obj1 = new staticMethod();
        //  System.out.println(a);static only accepts static
        System.out.println(obj1.a);

        System.out.println(b);

        System.out.println(staticMethod.b);
        System.out.println(obj1.b);// in the future do not call through object it works but not legal

    }


    public void method(){//instance method you can call instance variable

        System.out.println(a);

        System.out.println(b);//

    }
}
