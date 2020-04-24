package PracticeLoopReview;
import java.util.Scanner;
public class GuessANumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int GuessNumber = 0;
        int secretNumber = 83;

        do {
            System.out.println("Guess a number");
            GuessNumber = scan.nextInt();
            if (GuessNumber > secretNumber) {
                System.out.println("Your number is too large");
            } else if (GuessNumber < secretNumber) {
                System.out.println("Your number is too small");
            }

        } while (GuessNumber != secretNumber);

        System.out.println("Bingo you won");
    }
}
