package day08_IfStatements;
import java.util.*;

public class shopping_list {
/*
declare 4 String variable item1,item2,item3,report
declare double variables price 1 price 2 price 3, total price
display prompt"Enter item 1 and its price:"
Tomatoes
5.5
"Enter item 2 and its price:"
Cheese
3.5
"Enter item 3 and its price:"
Apple
6.3
calculate total price for all items

 */
    public static void main(String[] args) {

        String item1,item2,item3,report;
        double price1,price2,price3,totalPrice;

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter item1 and its price:");
        item1=scan.next();
        price1=scan.nextDouble();

        System.out.println("Enter item2 and its price:");
        item2=scan.next();
        price2=scan.nextDouble();

        System.out.println("Enter item3 and its price:");
        item3=scan.next();
        price3=scan.nextDouble();

        totalPrice = price1+price2+price3;

        report ="Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3;

        System.out.println(report);
        System.out.println("Total price: "+totalPrice);

    }
}
