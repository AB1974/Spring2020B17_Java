package day23_Methods;

/*
 //Access-modifier specifier return-type  methodName(){
					statements;
    1. write a method that can print all odd number between 1 ~ 100
	2. write a method that can print all even number between 1 ~ 100
 */
public class MethodsWithOutParameters {


    public static void main(String[] args) {

        printOddNumbers();
        System.out.println();
        printEvenNumbers();
    }


    public static void printOddNumbers() {


        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {

                System.out.print(i+" ");

            }
        }

    }

    public static void printEvenNumbers() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }


        }
        System.out.println();

        /*
        step1: void method (without parameter)
        step2: void method(with parameter)
        step3: return method (without parameter)
        step4: return method (with parameter)
        step5: using the method different clasess
        step6: overloading
            ...
 */



    }


}
