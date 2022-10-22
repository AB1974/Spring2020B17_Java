package day37_Constructors;

public class ConstructorIntro {

    public ConstructorIntro(int a) {//this is a method

        System.out.println("constructor with argument of int");

    }
//execution depends on Object (if you have two project it gets
// executed 2

    public static void main(String[] args) {

       ConstructorIntro obj1 = new ConstructorIntro(200);

    }
}
