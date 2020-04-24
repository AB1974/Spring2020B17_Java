package PracticeLoopReview;

public class Loop {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 140;
        while (n2 > n1) {

            System.out.println("n2 is greater ");
            n1+=10;
        }
        System.out.println("END");

        int x = 0;

        while (x < 5) {
            System.out.println("happy new year");
            ++x;
        }
        System.out.println("========================");
        int count = 0;
        while (count <= 100) {

            System.out.println(count);
            count++;
        }
        System.out.println("Count:" + count);
        System.out.println("===========================");

        int numberOfStudents = 1;
        while (numberOfStudents <= 10) {
            System.out.println("Student " + numberOfStudents);
            numberOfStudents++;

        }
        System.out.println("No more room");


    }
}
