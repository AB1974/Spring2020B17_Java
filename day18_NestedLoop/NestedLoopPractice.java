package day18_NestedLoop;

public class NestedLoopPractice {


    public static void main(String[] args) {

        for (int j = 0; j < 5; j++) {//repeat the action in the inner loop


            for (int i = 1; i <= 5; i++) {

                System.out.print(i + " ");

            }
            System.out.println();

        }

        System.out.println("==========While Nested Loop========================");

        /*
         ******
         ******
         ******
         ******
         ******
         ******
         ******
         */

        for (int i = 0; i < 7; i++) {//outer loop repeating inner loop over and over again

            int a = 1;
            while (a <= 10) {//inner loop repeat inner statement
                System.out.print("* ");
                a++;
            }

            System.out.println();

        }

















    }
}
