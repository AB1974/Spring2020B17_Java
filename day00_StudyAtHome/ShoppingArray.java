package day00_StudyAtHome;

import java.util.Arrays;

public class ShoppingArray {
    public static void main(String[] args) {

        String[] product = {"Timberland Shoes", "H&M Shirt", "Swatch Watch Watch", "Gucci Bag", "Adidas socks"};

        double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};

        int[] itemsIds = {12345, 12346, 12347, 12348, 12349,};

        //print the count of products
        //loop through products print each one separated lines
        //check if itemsid and products has same count

        System.out.println("Product count is : " + product.length);

        if (product.length == prices.length && prices.length == itemsIds.length) {

            System.out.println("Shopping list loooks good");
        } else {
            System.out.println("Something is wrong");
            return;
        }
        //for each loop
        for (String p : product) {

            System.out.println(p);
        }
        System.out.println();

        //prices for loop
        for (int i = 0; i < prices.length; i++) {

            System.out.println(prices[i]);
        }

        System.out.println("=========");

        for (int i1 = itemsIds.length - 1; i1 >= 0; i1--) {

            System.out.println(itemsIds[i1]);

        }
        //print a report with a total price
        //Item 1 :12345-Timberland Shoes-$120.0
        //Total price :

        System.out.println("#####Your shopping receipt#######");
        Double TotalPrice = 0.0;
        for (int i = 0; i < product.length; i++) {

            System.out.println("Item" + (i + 1) + " " + itemsIds[i] + " - " + product[i] + " - $" + prices[i]);
            TotalPrice += prices[i];

        }
        System.out.println("Total Price is: $" + TotalPrice);
        //Find most expensive item in your list print it as a report .
        //loop and find do not use Arrays class
// double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
        int maxIndex = 0;
        double maxPrice = 0;

        for (int j = 0; j < prices.length; j++) {

            if (prices[j] > maxPrice) {
                maxPrice = prices[j];
                maxIndex = j;
            }

        }
        System.out.println("Your expensive product " + itemsIds[maxIndex] + " - " + product[maxIndex] + " -$" + maxPrice);

        int minIndex=0;
        double min = 999999999
                ;

        for (int j = 0; j < prices.length; j++) {

            if (prices[j] < min) {
                min = prices[j];
                minIndex=j;
            }


        }
        System.out.println("Min price is :"+product[minIndex]+" "+min);
    }
}

