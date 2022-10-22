package day15_ForLoop;

public class    ForLoop {

    public static void main(String[] args) {

        //Whenever you have repeated actions you can apply for Loop

        System.out.println("Hello World");
        System.out.println("Hello World");


        System.out.println("========================");

        for (int i = 0 ;        i < 5;     i++)   {
            //initialization//condition/iterator//
            //mandatory     //mandatory//not necessary
            System.out.println("Hello World");

            //if the condition is true its keep executing like forever when the condition is false it will executed
            //when there is no iterator nothing wrong but there is a logical error .condition should exit.
        }
        System.out.println("==========================");

        for (int number = 1; number <=10; number +=1) {//number=1,3,5,7,9//
            //two ways// ++, or +=1

            System.out.println("number: "+number);
        }

        System.out.println("==========================");

        for (int number = 1; number <=10; number +=1) {//number=1,3,5,7,9//
            //two ways// ++, or +=1

            System.out.println("number: "+number*number);
        }

    }
}
