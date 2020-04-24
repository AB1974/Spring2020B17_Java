package day00_StudyAtHome;

public class DoWhileLoop {

    public static void main(String[] args) {
        //print numbers divisible by 15 in between 0~100.

        int j = 0;

        do {

            if (j % 15 == 0) {

                System.out.println(j);
            }

            j++;
        } while (j <= 100);



    }
}
