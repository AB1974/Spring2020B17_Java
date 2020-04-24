package PracticeLoopReview;
import java.util.Scanner;
public class Transactions {

    public static void main(String[] args) {
    /*
    What is the balance ?
    What is the transaction amount?
    We keep doing transactions until we run out of balance.
    100
    30
    You have insufficient funds , your balance is -10
    1.keep tracking transactions
    2.if balance negative or 0 it needs to print a warning
    3.display remaining balance every time after transactions
    4."Successful transactions count:"+3

     */
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your balance ? ");
        double balance = scan.nextDouble();
        int count = 0;

        while (balance > 0) {

            count++;
            System.out.println("What is your transaction # " + count + " amount?");
            double transaction = scan.nextDouble();

            if (transaction > balance) {
                System.out.println("Your balance is about to be negative due to this transaction");

            }


            balance -= transaction;
            System.out.println("Current balance: "+balance);
        }

        System.out.println("You have insufficient funds, your balance is  " + balance);
        System.out.println("Transactions total count:" + count);
    }
}
