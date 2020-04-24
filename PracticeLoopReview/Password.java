package PracticeLoopReview;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = "abc123";
        String input = "";

        do {

            System.out.println("Enter your password");
            input = scan.next();

        } while (!input.equals(password));

    }
}
