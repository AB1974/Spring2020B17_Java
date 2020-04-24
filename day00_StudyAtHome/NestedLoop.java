package day00_StudyAtHome;

public class NestedLoop {

    public static void main(String[] args) {
 /*
            nested loop: loop inside another loop
                        inner loop & outer loop
                nested loop: we only need them when we need to repeat a loop
                outer loop repeats the inner loop
         */

        for (int k = 1; k <= 3; k++) {

            for (int i = 10; i <= 30; i += 10) {

                System.out.print(i + " ");

            }
            System.out.println();
        }

        for (int l = 1; l <= 10; l++) {

            for (int k = 0; k <= 15; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("================");

        for (int l = 1; l <= 8; l++) {

            for (int k = 0; k < l; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
}

    }

