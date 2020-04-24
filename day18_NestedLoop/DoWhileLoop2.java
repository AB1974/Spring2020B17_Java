package day18_NestedLoop;

public class DoWhileLoop2 {

    public static void main(String[] args) {


        int number = 103;//print the numbers between ~100 number to 103!

        while (number >= 100) {

            System.out.println(number);
            number--;

        }
        //if condition is false it do not get  executed !

        System.out.println("===========DO WHILE=================================");

        int number2 = 103;
        do {
            System.out.println(number2);
            number2--;

        } while (number2 >= 100);//if condition is false it gets executed once!



    }
}
