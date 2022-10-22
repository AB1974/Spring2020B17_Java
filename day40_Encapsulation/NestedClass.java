package day40_Encapsulation;

public class NestedClass {

    static class data {//Only inner class can be static ! it become member of Nested Class.
        // It can be call through the class name
        static int a=100;
        static int b=200;

    }

    public static void main(String[] args) {
        System.out.println(NestedClass.data.a);
    }

}
