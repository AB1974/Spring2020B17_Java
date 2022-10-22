package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * create a class called Item
 * instance variables:
 * name, unitPrice, quantity
 * add a constructor that can initialize the fields
 * instance methods:
 * calcCost(): returns the total cost as double
 * hint: quantity * unitPrice
 * toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 * create a class called ShoppingList
 * create 5 objects of Item and store them into List of Items
 * calculate the total cost of all Items in the list
 */
public class Item {

    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double CalcCost() {//instance method

        return quantity * unitPrice;

    }

    public String toString() {

        return "Item: " + name + ", Unit price: $" + unitPrice + ", Quantity: " + quantity +
                "\nTotal Cost of Item: $" + CalcCost();
    }


    public static void main(String[] args) {
        Item item1 = new Item("toilet paper", 25, 100);
        Item item2 = new Item("banana", 3, 5);
        Item item3 = new Item("milk", 4, 2);
        Item item4 = new Item("bread", 4, 3);
        Item item5 = new Item("candy", 1.4, 5);


        ArrayList<Item> shoppingList = new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1, item2, item3, item4, item5));//bulk operators
        System.out.println(shoppingList);

        double totalCost = 0;
        //solution 1
        for (Item each : shoppingList) {
            totalCost += each.CalcCost();
        }

        System.out.println(totalCost);

        //solution 2
        double totalCost1 = 0;
        for(int i=0;i<shoppingList.size();i++){

            totalCost1+=shoppingList.get(i).CalcCost();

        }
        System.out.println(totalCost1);
    }
}
