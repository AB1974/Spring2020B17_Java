package PracticeLoopReview;

public class Alphabeth {
    public static void main(String[] args) {

        char letter = 'a';

        while (letter <= 'z') {
            System.out.print(letter + ", ");
            letter++;
        }
        System.out.println();//new line

        char capitals = 'A';

        while (capitals <= 'Z') {

            System.out.print(capitals + ", ");
            capitals++;
        }
        System.out.println();

        char reverseLowe = 'z';

        while (reverseLowe >= 'a') {
            System.out.print(reverseLowe + ", ");
            reverseLowe--;
        }
        System.out.println();
        char reverseUpper = 'Z';
        while (reverseUpper >= 'A') {
            System.out.print(reverseUpper + ", ");
            reverseUpper--;
        }

        System.out.println("\n====accumulation=====");

        String letters = "";
        char myLetter = 'A';

        while (myLetter <= 'G') {
            letters = letters + myLetter;
            System.out.println(letters);
            myLetter++;
        }

    }
}
