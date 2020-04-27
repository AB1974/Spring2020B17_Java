package day29_Wrapper_ArrayList;

public class Auto_Unboxing {

    public static void main(String[] args) {
        //autoboxing :primitive values to the wrapper class
        //unboxing :converting wrapper class to the primitive values.

        // Both  of them done by compiler automatically
        //primitives are not classes.


        int a = 100;//primitive
        Integer b = a;//Autoboxing.

        Byte byte1 = 98;
        short short1 = byte1;//unboxing
        byte b2 = byte1;    //unboxing
        int int1 = byte1;   //unboxing

        System.out.println("======METHODS OF WRAPPER CLASSES==========");
        //if the string is matching we can convert string to primitives!

        //PARSE METHODS: Convert string of text to the primitives!

        //valueOf methods:

    }
}
