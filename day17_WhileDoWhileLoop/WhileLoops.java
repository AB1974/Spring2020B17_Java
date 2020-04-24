package day17_WhileDoWhileLoop;

public class WhileLoops {

    public static void main(String[] args) {
        //whileLoop is similar to if statement .
        //you can get the statement as loon as you want .repeat action.
        //repeated if statement multiple times
        //you can only give boolean expression

       // while (10 > 9) {
           // System.out.println("Hello World");

        for (int i = 0; i <= 5; i++) {
            //initi     //condition //iteration

            System.out.println(i);
        }

        System.out.println("========== while loop=======");

        int i = 0;

        while (i <= 5) {
            System.out.println(i);
            i++;
            //you need to place iterator after the statement
            //any for loop can be converted to while loop!
        }

        while (true){
            System.out.println("Hello World");//infinite printout
        }
    }

    }
