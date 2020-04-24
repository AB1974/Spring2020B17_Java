package PracticeLoopReview;
import java.util.*;

public class RandomNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random random = new Random();


        int GuessNumber = 0;
        int secretNumber = random.nextInt(101);
        //this will give us a number between 0=100

        do {
            System.out.println("Guess a number");
            GuessNumber = scan.nextInt();
            if (GuessNumber < secretNumber) {
                System.out.println("Your number is too small");
            } else if(GuessNumber > secretNumber) {
                System.out.println("Your number is too large");
            }

        } while (GuessNumber != secretNumber);

        System.out.println("Bingo you won");

    }
}
