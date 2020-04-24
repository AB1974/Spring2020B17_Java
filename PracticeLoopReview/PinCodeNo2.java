package PracticeLoopReview;

import java.util.Scanner;

public class PinCodeNo2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int secretPinCode = 4321;
        //Give only 3 attempts
        //if attempts reaches more than 3 print card blocked.
        int PinCode = 0;
        int attempts =0;

        while (PinCode != secretPinCode) {

            System.out.println("Enter pinCode");
            PinCode = scan.nextInt();
            attempts++;

            if (attempts == 3 && PinCode != secretPinCode) {
                System.out.println("Card is blocked");
                return;//stop execution
            }
        }
        System.out.println("access granted");

    }
}
