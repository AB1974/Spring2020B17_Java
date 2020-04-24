package PracticeLoopReviewTwo;

public class EvenOrOdd {

    public static void main(String[] args) {
        //using for loop=1-100(if statements)
        //1.print all even numbers in same line
        //2.print all odd numbers in same line
        //3.sumOfOdds,sumOfEvens -calculate them
        //and print put after the loop

        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0) {
                System.out.println("Num is :  " + num + ", ");
            }
        }

        System.out.println("=======================");

        for (int num = 1; num <= 10; num++) {

            if (num % 2 != 0) {
                System.out.println("Num is: " + num + ",");

            }
        }

        System.out.println("=========================");
        int sumOfOdds = 0;
        int sumOfEvens = 0;
        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0) {
                sumOfEvens += num;
            } else {
                sumOfOdds += num;
            }

        }
        System.out.println(sumOfEvens);
        System.out.println(sumOfOdds);
    }

}
