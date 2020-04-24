package day18_NestedLoop;

public class Triangle {

    public static void main(String[] args) {


        int z = 1;
        while (z <= 7) {

            int i = 1;
            while (i <= z) {

                System.out.print("* ");
                i++;

            }

            System.out.println();

            z++;
        }
        System.out.println("=============");

        int z2 = 7;
        while (z2 >= 1) {

            int i2 = 1;
            while (i2 <= z2) {

                System.out.print("* ");
                i2++;

            }

            System.out.println();

            z2--;
        }


    }
}