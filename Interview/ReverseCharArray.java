package Interview;

import java.util.Arrays;

public class ReverseCharArray {

    public static void printreverse(char[] letters, int size) {
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }

    }

    public static void main(String[] args) {
        char[] letters = {'e', 'v', 'o', 'l', '4'};
       printreverse(letters,1);

    }
}
