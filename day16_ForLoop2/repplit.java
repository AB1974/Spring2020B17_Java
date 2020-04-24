package day16_ForLoop2;
import java.util.Scanner;
public class repplit {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String txt = s.next();

        String thirdLetter=""+txt.charAt(3);
        String fifthLetter=""+txt.charAt(5);
        String sixthLetter=""+txt.charAt(6);
        String result=thirdLetter+fifthLetter+sixthLetter;

        System.out.print(result);
    }
}
