package PracticeLoopReview;

public class StairCase {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
         */

        String stairs = "*";
        int count = 1;

        while (count <= 10) {
            System.out.println(stairs);
            stairs += "*";
            count++;

        }

        System.out.println("=======2.yol ======");

        stairs ="*";
        while(stairs.length()<=10){
            System.out.println(stairs);
            stairs+="*";
        }

    }
}
