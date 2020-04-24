package day16_ForLoop2;

public class ContinuePractice {

    public static void main(String[] args) {//skip print D,J,H


        for (char ch = 'Z'; ch >= 'A'; ch--) {

            if (ch == 'Y' || ch == 'J' || ch == 'D' || ch == 'H') {
                continue;
            }

            System.out.print(ch + " ");
        }
        System.out.println("==============");//skip the number divided by 3 or 5

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
