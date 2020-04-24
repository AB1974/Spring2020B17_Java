package PracticeLoopReview;

public class doWhileLoop {

    public static void main(String[] args) {

        int i = 1;
        while (i <=5) {//if it's true runs the code
            System.out.println(i);
            i++;
        }
        System.out.println("==============");

        int i1 = 1;
        do {//weather true or false runs the code for once.
            System.out.println(i1);
            i1++;
        } while (i1 <= 5);

        System.out.println("=============");
        //sum of the numbers1=2=3=4=5
        int sum=0;
        int j=1;
        do {
            sum += j;
            j++;
        } while (j <= 5);
        System.out.println(sum);

    }
}

