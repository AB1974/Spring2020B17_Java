package PracticeLoopReviewThree;
import java.util.Scanner;
public class RegisterTask {

    public static void main(String[] args) {
        /*
        Ask user how many items he purchased
        based on that number i will ask item name and price that many times
        you need to gather all items in one String variable items separated by coma
        calculate sum of each item price into variable total price
        then print out items and total price

         */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome, how many items are you purchasing today?");

        int itemsCount = keyboard.nextInt();
        double totalPrice = 0.0;
        String items = "";

        for (int count = 1; count <= itemsCount; count++) {
            System.out.println("What is item " + count + "?");
            String itemName = keyboard.next();

            System.out.println("How much is " + itemName + "?");
            double itemPrice = keyboard.nextDouble();
            //add  itemName to items and itemPrice to totalPrice
            items += itemName + ", ";
            totalPrice += itemPrice;

        }

        System.out.println("Your items: " + items);
        System.out.println("Your total Price :$ " + totalPrice);
    }
}
