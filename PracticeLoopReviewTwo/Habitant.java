package PracticeLoopReviewTwo;
import java.util.Scanner;
public class Habitant {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inhabitants = scan.nextInt();

        int Days = 0;

        while (inhabitants > 0) {

            System.out.println("Day" + Days + " [" + inhabitants + "]");
            Days++;
            inhabitants = inhabitants / 2;
        }
        System.out.println("----EXTINCT----");
    }

}
