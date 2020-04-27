package day29_Wrapper_ArrayList;

public class WrapperClass {

    public static void main(String[] args) {

        int a=100;//primitive

        Integer b=a;//wrapper class(represent int)

        short s1=200;
        int n1=s1;
        //Integer N1=s1;//Integer is dedicated to int primitive.it does not accept other primitives.
        //Wrapper classes is dedicated is only their own primitives.
        Integer n2=n1;// it works because n1 is int ! Integer is int too.

        System.out.println("==============");

        int ai=20;

       // float f1=a1;//Float  is dedicated to float primitive.it does not accept other primitives.

        Integer I1=200;
        int a2=I1;//complies

        Byte B1=126;
        int a3=B1;//yes you can assign byte to int ! but wrapper classes takes only their own type

    }
}
