package day18_NestedLoop;

public class DoWhilePractice {
    public static void main(String[] args) {

        //print all the odd numbers ~0-100 same line separated by space //do while loop


        int num = 0;


        do {
            if (num % 2 == 0) {

                System.out.print(num + " ");
            }

            num++;

        } while (num <= 100);//ending the loop
        System.out.println();
        System.out.println("==========================");

        int i = 1;

        do {

            System.out.println(i);

            i++;

        } while (i <= 5);
        System.out.println("+++++++++++++++++++++++++");
        int z = 1;

        do {

            System.out.println(z);
            if (z == 3) {
                break;
            }

            z++;

        } while (z <= 5);
        System.out.println("=============================");

        int y = 1;//3
        do {
            if (y == 3) {
                y++;//you need to make sure iterator is not skipping, so that the condition will eventually be false.
                continue;//this is for skip but do not forget do not skip iterator!
            }
            System.out.println(y);
            y++;
        } while (y <= 5);
        //3<=5
        System.out.println("=============================");

        //print all the odd numbers ~0-100 same line separated by space //do while loop

        int t = 1;
        do {
            if (t % 2 != 0) {
                t++;//this is important do not skip iterator(increment)
                continue;

            }
            System.out.print(t + " ");
            t++;
        } while (t <= 100);


    }
}
