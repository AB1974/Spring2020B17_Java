package PracticeLoopReview;

public class NUmbersReverse {
    public static void main(String[] args) throws InterruptedException {

        // 1,2,3,4,5,6,7,8,9,10
        int num = 1;

        while (num <= 10) {

            System.out.print(num + ", ");
            num++;
            // Thread.sleep(500);//pause the code execution for a second
        }
        System.out.println("\nNum value after loop" + num);
        System.out.println("==================");

        int num2 = 11;
        while (num2 >= 1) {

            System.out.print(num2 + ", ");
            num2--;
            //  Thread.sleep(1000);
        }
        System.out.println("\nThe value of num2: " + num2);
    }
}
